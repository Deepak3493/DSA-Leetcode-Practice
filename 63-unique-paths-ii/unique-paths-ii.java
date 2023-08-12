class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int dp[][] = new int[obstacleGrid.length+1][obstacleGrid[0].length+1];
        return findPath(obstacleGrid, 0,0, dp);
    }
    public static int findPath(int [][] arr, int p, int q, int dp[][]){
        if(p==arr.length-1 && q==arr[0].length-1){
            return arr[p][q]==1?0:1;
        }
        if(dp[p][q]!=0){
             return dp[p][q];
        }
        if(p>=arr.length || q>=arr[0].length ){
            return 0;
        }
        
        int right = arr[p][q]==1?0:findPath(arr, p,q+1, dp);
        int down = arr[p][q]==1?0:findPath(arr, p+1, q, dp);
        return dp[p][q] = right+down;
    }
}