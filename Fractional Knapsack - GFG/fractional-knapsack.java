//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}

class GfG {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int w = Integer.parseInt(inputLine[1]);
            Item[] arr = new Item[n];
            inputLine = br.readLine().trim().split(" ");
            for(int i=0, k=0; i<n; i++){
                arr[i] = new Item(Integer.parseInt(inputLine[k++]), Integer.parseInt(inputLine[k++]));
            }
            System.out.println(String.format("%.2f", new Solution().fractionalKnapsack(w, arr, n)));
        }
    }
}
// } Driver Code Ends


/*
class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}
*/

class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        Arrays.sort(arr, new mycomparator());
        int i =0;
        double ans = 0;
        while(i<n){
            Item k = arr[i];
            if(k.weight<=W){
                ans += k.value;
                W-=k.weight;
            }
            else{
                ans += ((W*1.0)/(k.weight*1.0))*k.value;
                W=0;
            }
            i++;
        }
        return ans;
    }
    static class mycomparator implements Comparator<Item>{
        public int compare(Item a,Item b){
            double one = (b.value*1.0)/b.weight*1.0;
            double two = (a.value*1.0)/a.weight*1.0;
            if(one>two){
               return 1;
             }
             else{
                 return -1;
             }
        }
    }
    
}