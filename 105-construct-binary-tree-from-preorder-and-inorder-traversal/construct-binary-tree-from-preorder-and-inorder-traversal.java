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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }
        return buildTree(preorder,0,preorder.length-1,inorder,0, inorder.length-1,mp);
    }
    public TreeNode buildTree(int[] preOrder,int preStart, int preEnd ,int[] inOrder
    , int inStart, int inEnd, HashMap<Integer, Integer> mp) {
        
        if(inStart>inEnd || preStart>preEnd)
            return null;

        TreeNode root = new TreeNode(preOrder[preStart]);

        int inOrderRoot = mp.get(preOrder[preStart]);
        int leftLength = inOrderRoot-inStart;
        
        TreeNode left = buildTree(preOrder, preStart+1, preStart+leftLength, inOrder, inStart,
        inOrderRoot-1,mp);

        TreeNode right = buildTree(preOrder, preStart+leftLength+1, preEnd, inOrder, inOrderRoot+1,inEnd,mp);

        root.left = left;
        root.right = right;

        return root;

    }
}