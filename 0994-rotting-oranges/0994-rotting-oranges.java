class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int rows = grid.length;
        int columns = grid[0].length;
        boolean hasEmptycell = false;
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                  if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                  }
                  if(grid[i][j]==0){
                    hasEmptycell = true;
                  }
            }
        }
        int dx [] = {0,0,-1,1};
        int dy [] = {1,-1,0,0};
        boolean visited[][] = new boolean[rows][columns];
        int count = -1;
        while(q.size()>0){
            int size = q.size();
            for(int j=0;j<size;j++){
                int []a = q.poll();
                int sr = a[0];
                int sc = a[1];
                visited[sr][sc] = true;
                for(int i=0;i<4;i++){
                int x = sr+dx[i];
                int y = sc+dy[i];
                    if(x>=0 && y>=0 && x<rows && y<columns && visited[x][y]==false && grid[x][y]==1){
                                visited[x][y]=true;
                                grid[x][y]=2;
                                q.add(new int[]{x,y});
                    }
                }
            }
            count++;

        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                  if(grid[i][j]==1){
                    return -1;
                  }
            }
        }
        return hasEmptycell && count==-1? 0: count;
    }
}