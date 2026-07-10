class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = m*n-1; //0-15
        while(left<=right){
            int mid = left +(right - left)/2;
            int row = mid/m;  
            int col = mid%m;
            System.out.println(row +" "+ col +" "+mid);

            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] <  target){
                left = mid+1;
            }
            else {
                right = mid-1;
            }
            System.out.println(row +" "+ col +" "+mid);

        }
        return false;
    }
}