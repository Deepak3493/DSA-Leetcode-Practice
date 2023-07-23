class Solution {
    public int uniquePaths(int m, int n) {
        int dp [][] = new int[m+1][n+1];
        return findPaths(m-1,n-1,dp);
    }
    public static int findPaths(int m, int n, int dp[][]){
        if(n<0 || m<0){
            return 0;
        }
        if(n==0 && m==0){
            return 1;
        }        
        if(dp[m][n]!=0){
            return dp[m][n];
        }
        int k = findPaths(m-1,n,dp) + findPaths(m,n-1,dp);
        dp[m][n] = k;
        return k;
    }
}