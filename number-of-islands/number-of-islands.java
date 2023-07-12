class Solution {
    public int numIslands(char[][] grid) {
        boolean visited [][] = new boolean[grid.length][grid[0].length];
        int count = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    dfs(i,j,grid,visited);
                    count++;
                }
            }
        }
        return count;
    }
    public static void dfs(int i, int j,char[][]grid, boolean visited[][]){
        visited[i][j] = true;
        int drx [] = {0,0,1,-1};
        int dry [] = {1,-1,0,0};
        for(int k=0;k<4;k++){
            int dx = drx[k]+i;
            int dy = dry[k]+j;
            if(dx>=0 && dx<grid.length && dy>=0 && dy<grid[0].length
             && !visited[dx][dy] && grid[dx][dy]=='1'){
                 dfs(dx,dy, grid, visited);
             }
        }
    }
}