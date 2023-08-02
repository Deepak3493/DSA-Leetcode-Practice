class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        int matrix[][] = new int[n][n];
        findAns(0,n,ans,matrix);
        return ans;
    }
    public static void findAns(int row,int totalQueens, List<List<String>> ans,int matrix[][]){
        if(row == totalQueens){
            List<String> subAns = new ArrayList<>();
            for(int i=0;i<matrix.length;i++){
              String rowString = "";
              for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==1)
                    rowString+="Q";
                else
                    rowString+=".";  
              }
              subAns.add(rowString);
            }
            ans.add(subAns);
            return;
        }
        for(int col=0;col<totalQueens;col++){
            if(checkifQueenCanBePlaced(row, col, matrix)){
                matrix[row][col] = 1;
                findAns(row+1,totalQueens,ans, matrix);
                matrix[row][col] = 0;
            }
        }
    }
    public static boolean checkifQueenCanBePlaced(int x, int y, int matrix[][]){
        for(int col = y;col>=0;col--){
            if(matrix[x][col]==1){
                return false;
            }
        }
        for(int row = x;row>=0;row--){
            if(matrix[row][y]==1){
                return false;
            }
        }
        for(int row = x, col=y;row>=0 && col>=0; row--,col--){
            if(matrix[row][col]==1){
                return false;
            }
        }

        for(int row = x, col=y;row>=0 && col<matrix[0].length; row--,col++){
            if(matrix[row][col]==1){
                return false;
            }
        }
        return true;
    }
}