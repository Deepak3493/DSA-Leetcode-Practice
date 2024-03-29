//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {

		Scanner sc=new Scanner(System.in);
		int test=sc.nextInt();
		while(test-- > 0){
		    int p=sc.nextInt();             // Take size of both the strings as input
		    int q=sc.nextInt();
		    
		    String s1=sc.next();            // Take both the string as input
	        String s2=sc.next();
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.lcs(p, q, s1, s2));
		}
	}
}
// } Driver Code Ends


class Solution
{
    //Function to find the length of longest common subsequence in two strings.
    static int lcs(int x, int y, String s1, String s2)
    {
        // your code here
        int dp [][] = new int[x+1][y+1];
        for(int i=0 ;i<x ;i++){
            Arrays.fill(dp[i],-1);
        }
        return lcs(x-1, y-1, s1, s2, dp);
    }
    static int lcs(int x, int y, String s1, String s2,  int dp [][]){
        if(x<0 || y<0){
            return 0;
        }
        if(dp[x][y]!=-1){
            return dp[x][y];
        }
        if(s1.charAt(x)==s2.charAt(y)){
            dp[x][y] = 1+lcs(x-1, y-1, s1, s2, dp);
        }
        else{
            dp[x][y] = Math.max(lcs(x-1, y, s1, s2, dp),lcs(x, y-1, s1, s2, dp));
        }
        return dp[x][y];
    }
    
}