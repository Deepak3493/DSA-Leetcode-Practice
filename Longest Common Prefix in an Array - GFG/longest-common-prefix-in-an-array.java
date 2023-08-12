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
            int n = Integer.parseInt(read.readLine().trim());
            String arr[] = read.readLine().trim().split(" ");

            Solution ob = new Solution();
            System.out.println(ob.longestCommonPrefix(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestCommonPrefix(String arr[], int n){
        // code here
        int minLen = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            minLen = Math.min(arr[i].length(), minLen);
        }
        String ans = "";
        for(int i=0;i<minLen;i++){
            char ch = 'a';
            for(int j=0;j<n;j++){
                if(j==0){
                    ch = arr[j].charAt(i);
                }
                else {
                    if(ch != arr[j].charAt(i)){
                       return ans.length()>0 ? ans : "-1";
                    }
                }
            }
            ans += ch;
        }
       
        return ans.length()>0 ? ans : "-1";
    }
}