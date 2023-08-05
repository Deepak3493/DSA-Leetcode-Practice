class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp [] = new int[amount+1];
        return coinChange(coins, amount, dp);
    }
    public int coinChange(int[] coins, int amount, int dp[]) {
        if(amount<0){
            return -1; 
        }
        if(amount == 0 ){
            return 0;
        }
        if(dp[amount]!=0){
            return dp[amount];
        }
        int min = Integer.MAX_VALUE;
        for(int coin :coins){
            int taken = coinChange(coins,amount-coin,dp);
            if(taken>=0 && taken<min){
                min =1+taken;
            }

        }
        dp[amount]= min == Integer.MAX_VALUE? -1:min;
        return dp[amount];
    }
}
