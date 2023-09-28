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

/*
approach - 1

 - place all the elements in a arraylist and sort all the elements and 
 - return the element at (m*n)/2;
 - space = m*n  time - m*nlog(m*n)+m*n;
 
 
approach - 2
 - find min and max from the whole matrix;
 - now req element will be (min+max)/2;
 - run the while loop between min and max as low and high
 - find mid element by (low+high)/2;
 -
 
*/
class Solution {
    int median(int matrix[][], int R, int C) {
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
       for(int i=0;i<R;i++){
           for(int j=0;j<C;j++){
               min = Math.min(matrix[i][j], min);
               max = Math.max(matrix[i][j], max);
           }
       }
       int req = (R*C)/2;
       int low = min;
       int high = max;
       while(low<=high){
           int mid = (low+high)/2;
           int countOfReq = countReq(matrix,mid,R,C);
           if(countOfReq<=req){
               low = mid+1;
           }
           else{
               high = mid-1;
           }
       }
       return low;
    }
    public static int countReq(int matrix[][], int mid, int R, int C){
        int count = 0;
        for(int i=0;i<R;i++){
            count+=upperBound(matrix[i],mid,C);
        }
        return count;
    }
    public static int upperBound(int matrix[],int req, int n){
        int low = 0;
        int high = n-1;
        int bound = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(matrix[mid]<=req){
                low = mid+1;
                bound = low;
            }
            else{
                high = mid-1;
            }
        }
        return bound;
    }
    
}