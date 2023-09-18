//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


// } Driver Code Ends
//User function Template for Java

class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
 
        int count = 1;
        int num = 1;
        int ans = 0;
        while(count<32){
            if(((a&num)!=0) && ((b&num)!=0)){
               count++;
               num = num<<1;
               continue;
            }
            else if ((a&num)!=0){
                 ans++;
            }
            else if ((b&num)!=0){
                  ans++;
            }
            count++;
            num = num<<1;
        }
        return ans;
        
    }
    
    
}


//{ Driver Code Starts.

// Driver class
class Main {
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int m, n;
		long ans = 0; // initialise ans to 0
		while(t-->0) {
		    
		    //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    Solution obj = new Solution();
		    System.out.println(obj.countBitsFlip(m, n));
		}
	}
}


// } Driver Code Ends