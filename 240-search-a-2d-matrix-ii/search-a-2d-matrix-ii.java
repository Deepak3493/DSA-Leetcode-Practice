class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length-1;
        while(true){
          if(matrix[i][j]>target){
              j--;
          }
          else if(matrix[i][j]<target){
               i++;
          }
          else if(matrix[i][j]==target){
              return true;
          }

          if(i<0 || j<0 ||i>=matrix.length ||j>=matrix[0].length){
              return false;
          }

        }

    }
}