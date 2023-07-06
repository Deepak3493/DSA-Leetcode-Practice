class Solution {
    public int maxSubArray(int[] nums) {
        int maxsumSoFar = nums[0];
        int sum = nums[0];
        Boolean isAllNeg = false;
        for(int i=1;i<nums.length;i++){
           sum = Math.max(sum+nums[i], nums[i]);
           maxsumSoFar = Math.max(maxsumSoFar,sum);
        }
        return maxsumSoFar;
    }
}