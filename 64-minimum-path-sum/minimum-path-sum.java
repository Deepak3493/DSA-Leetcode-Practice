class Solution {
    public int minPathSum(int[][] grid) {
       int dp [][] = new int[grid.length][grid[0].length];
       return dfs(0,0,grid,dp);
    }
    public static int dfs(int x, int y, int grid[][],int dp [][]){
        if(x==grid.length-1 && y== grid[0].length-1){
            return grid[x][y];
        }
        if(dp[x][y]!=0){
            return dp[x][y];
        }
        int k = grid[x][y];
        int left = Integer.MAX_VALUE;
        int right = Integer.MAX_VALUE;
        if(x+1<grid.length && y<grid[0].length){
            left = Math.min(left, dfs(x+1,y,grid,dp));
        }
        if(x<grid.length && y+1<grid[0].length){
            right = Math.min(right, dfs(x,y+1,grid,dp));
        }
        return dp[x][y] = k+Math.min(left, right);
    }
}