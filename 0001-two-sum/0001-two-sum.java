class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int ans[] = new int[2];
        for(int i=0;i<nums.length;i++){
            int currentNum = nums[i];
            int leftSum = target - currentNum;
            if(mp.containsKey(leftSum)){
                ans[0]= i;
                ans[1]= mp.get(leftSum);
            }
            mp.put(currentNum, i);
        }
        return ans;
    }
}