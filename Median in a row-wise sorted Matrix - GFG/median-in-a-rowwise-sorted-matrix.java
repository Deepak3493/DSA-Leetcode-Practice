//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S[] = read.readLine().split(" ");
            int R = Integer.parseInt(S[0]);
            int C = Integer.parseInt(S[1]);
            int matrix[][] = new int[R][C];
            int c = 0;
            for(int i = 0; i < R; i++){
                String line[]=read.readLine().trim().split(" ");
                for(int j = 0; j < C; j++){
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix, R, C);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int median(int matrix[][], int R, int C) {
        // code here   
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int i=0;i<R;i++){
            low = Math.min(low,matrix[i][0]);
            high = Math.max(high, matrix[i][C-1]);
        }
        
        int reqMed = (R*C)/2;
        while(low<=high){
            int mid = (low+high)/2;
            int countSmall = countSmaller(matrix, mid, R, C);
            if(countSmall <= reqMed)
               low = mid+1;
            else
               high = mid-1;
        }
        return low-1;
    }
    int countSmaller(int matrix[][], int mid, int row ,int col){
        int count = 0;
        for(int i=0;i<row;i++){
            count+= upperBound(matrix[i], mid, col);
        }
        return count;
    }
    int upperBound(int matrix[], int req,int n){
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low<=high){
            int mid = (low+high)/2;
            if(matrix[mid]<req){
                low = mid+1;
            }
            else{
                ans = mid;
                high = mid-1;
            }
        }
        return ans;
    }
}