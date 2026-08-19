class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int top =0;
        int bottom = matrix.length-1;
        int left =0;
        int right = matrix[0].length-1;
        int total  = matrix.length* matrix[0].length;
        int count =0;
        while(count<total){
           for(int i=left;i<=right && total>count;i++){
                  count++;
                  ans.add(matrix[top][i]);
           }
           top++;
           for(int i=top;i<=bottom && total>count;i++){
                  count++;
                  ans.add(matrix[i][right]);
           }
           right--;
           for(int i=right;i>=left && total>count;i--){
                  count++;
                  ans.add(matrix[bottom][i]);
           }
           bottom--;
           for(int i=bottom;i>=top && total>count;i--){
                  count++;
                  ans.add(matrix[i][left]);
           }
           left++;
        }
        return ans;
    }
}