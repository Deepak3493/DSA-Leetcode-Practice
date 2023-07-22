class Solution {
    public void rotate(int[][] matrix) {
       int n = matrix.length;
       int newMatrix[][] = new int[matrix[0].length][matrix.length];
       for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
              newMatrix[n-i-1][j] = matrix[i][j];
           }
       }

        for(int i=0;i<matrix.length;i++){
           for(int j=0;j<matrix[0].length;j++){
              matrix[j][i] = newMatrix[i][j];
           }
       }
    }
}