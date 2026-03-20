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
    public TreeNode deleteNode(TreeNode root, int key) {
        return searchAndDelete(root, key);
    }
    public TreeNode searchAndDelete(TreeNode root, int key) {
        if(root ==null)
            return null;
        else if(root.val == key){
             if(root.left ==null && root.right ==null){
                return null;
             }
             else if(root.right!=null){
                TreeNode temp1 = root.right;
                TreeNode temp2 = root;
                boolean movedToleft = false;
                while(temp1.left!=null){
                    temp2 = temp1;
                    temp1 = temp1.left;
                    movedToleft = true;
                }
                int a = root.val;
                root.val = temp1.val;
                temp1.val = a;
                if (movedToleft) {
                    if(temp1.right!=null){
                        root.right = searchAndDelete(root.right, key);
                    }
                    else{
                        temp2.left = null;
                    }
                    return root;

                } else {
                    root.right = searchAndDelete(root.right,key);
                }   
             }
             else{
                return root.left;
             }
        }
        else if(root.val>key)
            root.left =  searchAndDelete(root.left, key);
        else
            root.right =  searchAndDelete(root.right, key);
        return root;
    }
}