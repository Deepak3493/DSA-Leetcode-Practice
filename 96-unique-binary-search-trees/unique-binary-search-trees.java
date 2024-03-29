class Solution {
    public int numTrees(int n) {
        int dp[] = new int[n+1];
        return numTrees(n, dp);
    }
    public int numTrees(int n, int dp[]) {
        if(n<=1)
           return 1;
        if(dp[n]!=0)
            return dp[n];
        int ans = 0;
        for(int i=1;i<=n;i++){
            ans += numTrees(i-1,dp) * numTrees(n-i,dp);
        }
        return dp[n] = ans;
    }
}