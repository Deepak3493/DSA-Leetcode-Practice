class Solution {
    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
           int completementVal = target-nums[i];
           if(mp.containsKey(completementVal)){
               arr[0] = mp.get(completementVal);
               arr[1] = i;
               return arr;
           }
           mp.put(nums[i],i);
        }
        return arr;
    }
}