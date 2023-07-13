class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int preSum = 0;
        int count = 0;
        mp.put(0,1);
        for(int i=0;i<nums.length;i++){
            preSum +=nums[i];
            if(mp.containsKey(preSum-k) ){
                int x = mp.get(preSum-k);
                count+=x;
            }
            if(mp.containsKey(preSum)){
                int x = mp.get(preSum);
                mp.put(preSum,x+1);
            }
            else{
                mp.put(preSum, 1);
            }
        }
        return count;
    }
}