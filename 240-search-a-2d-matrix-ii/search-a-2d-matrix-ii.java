class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length-1;
        int n = matrix.length;
        while(col>=0 && row<n){
            int num = matrix[row][col];
            if(num<target){
                 row++;
            }
            else if(num>target){
                 col--;
            }
            else{
                return true;
            }
        }
        return false;
    }
    
}