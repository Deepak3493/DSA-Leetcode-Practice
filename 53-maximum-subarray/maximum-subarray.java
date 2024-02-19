class Solution {
    public int maxSubArray(int[] nums) {
       if(nums.length == 0)
          return 0;
       int sumAns = Integer.MIN_VALUE ;
       int sumSoFar = 0;
       for(int i=0;i<nums.length;i++){
           sumSoFar = Math.max(nums[i], sumSoFar+nums[i]);
           sumAns = Math.max(sumSoFar, sumAns);
       }
       return sumAns;
    }
}