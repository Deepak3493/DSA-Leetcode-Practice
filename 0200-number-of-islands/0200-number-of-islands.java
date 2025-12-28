class Solution {
    public int numIslands(char[][] grid) {
        
        int rows = grid.length;
        int columns = grid[0].length;
        int count = 0;
        int vertics = Math.max(rows, columns);
        boolean visited [][] = new boolean[rows][columns];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++)
            {
                
                if(visited[i][j]==false && grid[i][j]=='1'){
                    dfs(i,j, visited, grid);
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int row,int col, boolean visited[][], char[][] grid){
        visited[row][col] = true;
        int dx [] = {0,0,1,-1};
        int dy [] = {1,-1,0,0};
        for(int i=0;i<4;i++){
            int x = dx[i]+row;
            int y = dy[i]+col;
            if(x>=0 && y>=0 && x<grid.length && y<grid[0].length && visited[x][y] == false && (grid[x][y]=='1')){
                visited[x][y] = true;
                dfs(x, y , visited, grid);
            }
        }
    }
}