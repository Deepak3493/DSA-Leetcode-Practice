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
    public boolean isValidBST(TreeNode root) {
        if(root == null)
            return true;
       
        long max = (long)Integer.MAX_VALUE+(long)100;
        long min = (long)Integer.MIN_VALUE-(long)100;
        return isValidBST(root,min ,max);
    }
    public boolean isValidBST(TreeNode root, long min, long max) {
        if(root==null)
            return true;
        if(root.val<=min || root.val>=max )
            return false;
        return isValidBST(root.left,min, root.val) && 
               isValidBST(root.right,root.val, max);
    }
}