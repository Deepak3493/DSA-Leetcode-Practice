//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.findPosition(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static int findPosition(int N) {
        // code here
        if(N==0){
            return -1;
        }
        int a = 1;
        int ans  = -1;
        int count = 1;
        while(count<32){
            if((N&a)!=0){
                if(ans!=-1){
                  return -1;
                }
                ans = count;
            }
            count++;
            a= a<<1;
        }
       return ans;
    }
};