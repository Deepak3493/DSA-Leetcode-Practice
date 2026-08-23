class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int left = 0;
        int top = 0;
        int right = matrix[0].length - 1;
        int bottom = matrix.length - 1;
        int count = 0;
        int n = matrix[0].length;
        int m = matrix.length;
        while (count < n * m) {
            for (int i = left; i <= right && count < n * m; i++) {
                ans.add(matrix[top][i]);
                count++;
            }
            top++;
            for (int i = top; i <= bottom && count < n * m; i++) {
                ans.add(matrix[i][right]);
                count++;

            }
            right--;
            for (int i = right; i >= left && count < n * m; i--) {
                ans.add(matrix[bottom][i]);
                count++;

            }
            bottom--;
            for (int i = bottom; i >= top && count < n * m; i--) {
                ans.add(matrix[i][left]);
                count++;

            }
            left++;
        }
        return ans;
    }
}