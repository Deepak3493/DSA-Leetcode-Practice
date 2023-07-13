class Solution {
    public int rob(int[] nums) {
        int dp [] = new int[nums.length+1];
        Arrays.fill(dp,-1);
        int firstAdded = find(0,nums.length,nums, dp);
        Arrays.fill(dp,-1);
        int firstNotAdded = find(1,nums.length, nums, dp);
        return Math.max(firstAdded, firstNotAdded);
    }
    public static int find(int start,int end, int nums[], int dp[]){
        if(start>=end){
            return 0;
        }
        if(dp[start]!=-1){
            return dp[start];
        }
        int loot = find(start+2, end, nums, dp)+nums[start];
        int notLoot = find(start+1,end, nums, dp);
        dp[start]= Math.max(loot, notLoot);
        return dp[start];
    }
}