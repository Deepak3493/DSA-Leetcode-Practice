class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        return findAns(n, dp);
    }
    public static int findAns(int n, int dp[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(n==2){
            return 2;
        }
        if(dp[n]!=0){
            return dp[n];
        }
        dp[n] = findAns(n-1,dp) + findAns(n-2,dp);
        return dp[n];
    }
}