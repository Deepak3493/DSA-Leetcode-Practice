//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum = 0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
        }
        if(sum%2!=0){
            return 0;
        }
        else
        {
            Boolean dp [][] = new Boolean[sum/2+1][N];
            return isSubSetExists(arr, sum/2,N-1,dp) ==true ? 1: 0;
        }
    }
    static boolean isSubSetExists(int arr[], int sum, int N, Boolean dp[][]){
        if(sum==0){
            return true;
        }
        if(N<0 || sum<0){
            return false;
        }
        if(dp[sum][N]!=null){
            return dp[sum][N];
        }
        boolean left = false;
        if(sum>=arr[N]){
             left = isSubSetExists(arr, sum-arr[N], N-1,dp);
        }
        boolean right = isSubSetExists(arr, sum, N-1,dp);
        dp[sum][N] = left||right;
        return dp[sum][N];
    }
}