//{ Driver Code Starts
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
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
            for(int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
            for(int i = 0; i < E; i++){
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
            }
            Solution obj = new Solution();
            int ans = obj.findMotherVertex(V, adj);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends



class Solution
{
    //Function to find a Mother Vertex in the Graph.
    public int findMotherVertex(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        boolean visited[] = new boolean[V];
        int lstVisted = 0;
        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(i,V, adj,visited);
                lstVisted = i;
            }
        }
        visited = new boolean[V];
        dfs(lstVisted,V,adj, visited);
         for(int i=0;i<V;i++){
            if(!visited[i]){
                return -1;
            }
        }
        return lstVisted;
    }
    public static void dfs(int vertex, int V, ArrayList<ArrayList<Integer>>adj,  boolean visited[] ){
        visited[vertex]= true;
        for(int i=0;i<adj.get(vertex).size();i++){
            int k = adj.get(vertex).get(i);
            if(!visited[k]){
                dfs(k,V,adj,visited);
            }
        }
    }
}