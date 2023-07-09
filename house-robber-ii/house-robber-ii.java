class Solution {
    public int rob(int[] nums) {
      int n = nums.length;
       if(n==1){
          return nums[0];
        }
      int dp[] = new int[n+1]; 
      Arrays.fill(dp, Integer.MAX_VALUE);
      int excludeLast =  ans(nums,0, n-2, dp);
      dp = new int[n+1];
      Arrays.fill(dp, Integer.MAX_VALUE);
      int excludeFirst = ans(nums, 1, n-1, dp);
      return Math.max(excludeLast, excludeFirst);
    }

    public int ans(int nums[], int start, int end, int dp[]){
         if(end<start){
             return 0;
         }
         if(dp[end]!=Integer.MAX_VALUE){
             return dp[end];
         }
         int includeHouse = ans(nums,start, end-2, dp)+nums[end];
         int excludeHouse = ans(nums, start, end-1, dp);

         dp[end] = Math.max(includeHouse, excludeHouse);
         return dp[end];
    }
}