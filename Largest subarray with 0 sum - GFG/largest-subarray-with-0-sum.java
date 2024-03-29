//{ Driver Code Starts
import java.util.*;

class MaxLenZeroSumSub
{

    // Returns length of the maximum length subarray with 0 sum

    // Drive method
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}
// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        int preSum = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        int ans = 0;
        for(int i=0;i<n;i++){
            preSum+=arr[i];
            if(preSum==0){
                ans = i+1;
            }
            else if(mp.containsKey(preSum)){
                int lastInd = mp.get(preSum);
                ans = Math.max(ans, i-lastInd);
            }
            else{
                mp.put(preSum, i);
            }
        }
        return ans;
    }
}