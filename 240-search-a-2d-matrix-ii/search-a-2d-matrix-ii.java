class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length-1;
        int col = 0;
        int m = matrix[0].length;
        while(col<m && row>=0){
            int num = matrix[row][col];
            if(num<target){
                 col++;
            }
            else if(num>target){
                 row--;
            }
            else{
                return true;
            }
        }
        return false;
    }
    
}