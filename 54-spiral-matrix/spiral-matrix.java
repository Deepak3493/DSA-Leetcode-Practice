class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         int n = matrix.length;
        int m = matrix[0].length;
        int total = m*n;
        int count = 0;
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = m-1;
        List<Integer> ans = new ArrayList<>();
        while(count<total){
           for(int i=left;i<=right && count<total;i++){
               ans.add(matrix[top][i]);
               count++;
           }
           top++;
           for(int i=top;i<=bottom && count<total;i++){
               ans.add(matrix[i][right]);
               count++;
           }
           right--;
           for(int i= right;i>=left && count<total;i--){
               ans.add(matrix[bottom][i]);
               count++;
           }
           bottom--;
           for(int i = bottom;i>=top && count<total;i--){
               ans.add(matrix[i][left]);
               count++;
           }
           left++;
        }
        return ans;
    }
}