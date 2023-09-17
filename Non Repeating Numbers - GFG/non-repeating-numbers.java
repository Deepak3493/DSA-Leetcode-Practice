//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine();
            String[] S = s.split(" ");
            int[] v = new int[2 * n + 2];
            for(int i = 0; i < 2 * n + 2; i++)
            {
                v[i] = Integer.parseInt(S[i]);
            }
            Solution ob = new Solution();
            int[] ans = ob.singleNumber(v);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] singleNumber(int[] nums)
    {
        // Code here
        int xor = 0;
        for(int i = 0;i<nums.length ;i++){
            xor^=nums[i];
        }
        
        int k = xor & (-(xor-1));
       // System.out.println(xor+" "+k);
        int x = 0;
        int y = 0;
        for(int i = 0;i<nums.length ;i++){
            if((k&nums[i])==0){
                x^=nums[i];
            }
            else{
                y^=nums[i];
            }
        }
        
        int arr[] = new int[2];
        if(x>y){
            arr[0] = y;
            arr[1] = x;
        }
        else{
            arr[0] = x;
            arr[1] = y;
        }
         return arr;
    }
}