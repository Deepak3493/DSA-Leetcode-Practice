class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            if(mp.containsKey(num) && Math.abs(i-mp.get(num))<=k)
              return true;
            mp.put(num, i);
        }
        return false;
    }
}