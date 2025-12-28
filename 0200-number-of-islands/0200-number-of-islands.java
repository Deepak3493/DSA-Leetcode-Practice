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
                    bfs(i,j, visited, grid);
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
                dfs(x, y , visited, grid);
            }
        }
    }
    
    public void bfs(int row, int col, boolean visited[][], char[][] grid)
    {
        Queue<Pair<Integer,Integer>> q = new LinkedList<>();
        visited[row][col]= true;
        q.add(new Pair(row, col));
        while(q.size()>0){
           int size = q.size();
           for(int i=0;i<size;i++){
              Pair p = q.poll();
              Integer x = (Integer) p.getKey();
              Integer y = (Integer) p.getValue();
              visited[x][y]= true;
              if(x+1<grid.length && visited[x+1][y]==false && grid[x+1][y] == '1'){
                visited[x+1][y]= true;
                q.add(new Pair(x+1,y));
              }
              if(y+1<grid[0].length && visited[x][y+1]==false && grid[x][y+1] == '1'){
                 visited[x][y+1]= true;
                q.add(new Pair(x,y+1));
              }
              if(y-1>=0 && visited[x][y-1]==false && grid[x][y-1] == '1'){
                 visited[x][y-1]= true;
                q.add(new Pair(x,y-1));
              }
              if(x-1>=0 && visited[x-1][y]==false && grid[x-1][y] == '1'){
                 visited[x-1][y]= true;
                q.add(new Pair(x-1,y));
              }
           }
        }
            
    }

}