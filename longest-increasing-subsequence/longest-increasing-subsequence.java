class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,1);
        int max = 0;
        for(int i=0;i<nums.length;i++){
            int k = nums[i];
            int max1 = 0;
            for(int j=i-1;j>=0;j--){
                if(nums[j]<k){
                    max1 = Math.max(max1,dp[j]);
                }
            }
            dp[i] = max1+1;
            max = Math.max(dp[i],max);
        }
        return max;
    }
}