//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        Deque<Long> dq = new ArrayDeque<Long>();
        long ans [] = new long[N-K+1];
        int j=0;
        for(int i=0;i<N;i++){
            if(i<K-1){
                dq.add(A[i]);
                while(dq.size()>0){
                    if(dq.getLast()<0){
                        break;
                    }
                    else{
                        dq.removeLast();
                    }
                }
                continue;
            }
            dq.add(A[i]);
            while(dq.size()>0){
                if(dq.getLast()<0){
                    break;
                }
                else{
                    dq.removeLast();
                }
            }
            if(dq.size()>0){
                if(dq.getFirst()<0){
                    ans[j]=dq.getFirst();
                    j++;
                }
                else{
                    ans[j] = 0;
                    j++;
                }
            }
            else{
                ans[j]=0;
                j++;
            }
            if(dq.size()>0 && A[j-1]==dq.getFirst()){
                dq.removeFirst();
            }
            
        }
        return ans;
    }
}