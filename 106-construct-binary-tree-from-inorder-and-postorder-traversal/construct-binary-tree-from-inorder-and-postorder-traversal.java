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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
     HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            mp.put(inorder[i],i);
        }
        return buildTree(postorder,0,postorder.length-1,inorder,0, inorder.length-1,mp);
    }
    public TreeNode buildTree(int[] postorder,int posStart, int posEnd ,int[] inOrder
    , int inStart, int inEnd, HashMap<Integer, Integer> mp) {
        
        if(inStart>inEnd || posStart>posEnd)
            return null;

        TreeNode root = new TreeNode(postorder[posEnd]);

        int inOrderRoot = mp.get(postorder[posEnd]);
        int leftLength = inOrderRoot-inStart-1;
        
        TreeNode left = buildTree(postorder, posStart, posStart+leftLength, inOrder, inStart,
        inOrderRoot-1,mp);

        TreeNode right = buildTree(postorder, posStart+leftLength+1, posEnd-1, inOrder, inOrderRoot+1,inEnd,mp);

        root.left = left;
        root.right = right;

        return root;

    }
}