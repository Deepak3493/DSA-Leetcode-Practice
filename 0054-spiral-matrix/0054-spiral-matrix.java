class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int count = 0;
        int rows = matrix.length;
        int columns = matrix[0].length;
        int left = 0;
        int top = 0;
        int right = columns-1;
        int bottom = rows-1;
        List<Integer> ans = new ArrayList<>();
        while(count<rows*columns){
            for(int i=left;i<=right && count<rows*columns;i++){
                ans.add(matrix[top][i]);
                count++;
            }

            top++;

            for(int i=top;i<=bottom && count<rows*columns;i++){
                ans.add(matrix[i][right]);
                count++;
            }

            right--;

            for(int j = right;j>=left && count<rows*columns;j--){
                ans.add(matrix[bottom][j]);
                count++;
            }

            bottom--;

            for(int j = bottom;j>=top && count<rows*columns;j--){
                ans.add(matrix[j][left]);
                count++;
            }

            left++;
        }
        return ans;
    }
}