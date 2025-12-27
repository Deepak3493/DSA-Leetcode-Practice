class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected[0].length;
        int visited[] = new int[n];
        
        int count = 0;
        for(int i = 0; i<n; i++){
            if(visited[i] ==0){
                count++;
                dfs(i,visited, isConnected);
            }
        } 
        return count;
    }
    public static void dfs(int node, int visited[], int[][] isConnected){
        visited[node] = 1;
        for(int i =0;i<isConnected[node].length;i++){
            if(visited[i]==0 && isConnected[node][i] == 1)
                dfs(i,visited,isConnected);
        }
    }

}