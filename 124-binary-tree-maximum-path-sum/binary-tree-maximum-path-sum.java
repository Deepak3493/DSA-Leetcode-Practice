/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxSum = Integer.MIN_VALUE;
        find(root);
        return maxSum;
    }
    public int find(TreeNode root) {
        if(root == null){
            return -100000;
        }
        if(root.left==null && root.right==null){
            maxSum = Math.max(maxSum, root.val);
            return root.val;
        }
        int left = find(root.left);
        int right = find(root.right);
        int  ans = Math.max(left,right);
        ans = Math.max(left+root.val,right+root.val);
        ans = Math.max(root.val, ans);
        ans = Math.max(ans, left+right+root.val);
        maxSum = Math.max(maxSum, ans);
        return Math.max(root.val,root.val+Math.max(left,right));
    }
}