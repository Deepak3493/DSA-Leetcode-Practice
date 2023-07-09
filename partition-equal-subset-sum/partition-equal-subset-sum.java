class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        if(sum%2!=0)
           return false;
        
        int N = nums.length;
        sum = sum/2;
        Boolean dp[] [] = new Boolean[N+1][sum+1];
        isSubsetSum(N-1, nums, sum, dp);
        for(int i=0;i<N+1;i++){
            for(int j=0;j<sum+1;j++){
                if(dp[i][j]!=null && dp[i][j] == true)
                    return true;
            }
        }
        return false;

    }
    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        Boolean dp[] [] = new Boolean[N+1][sum+1];
        isSubsetSum(N-1, arr, sum, dp);
        for(int i=0;i<N+1;i++){
            for(int j=0;j<sum+1;j++){
                if(dp[i][j]!=null && dp[i][j] == true)
                    return true;
            }
        }
        return false;
    }
    
    static Boolean isSubsetSum(int ind, int arr[], int sum ,Boolean dp[][]){
        
        if(sum==0){
            return true;
        }  
        
        if(ind<0 || sum<0)
            return false;
            
            
        if(dp[ind][sum] != null )
            return dp[ind][sum];
            
        Boolean include = isSubsetSum(ind-1, arr, sum-arr[ind], dp);
        Boolean notInclude = isSubsetSum(ind-1, arr, sum, dp);
        dp[ind][sum]= include || notInclude;
        return dp[ind][sum];
    }
}