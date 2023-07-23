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
        return builTrees(preorder, inorder, 0,inorder.length-1, 0,preorder.length-1,mp);
    }
    public TreeNode builTrees(int[] preorder, int[] inorder, int startin, int endin, int startpre, int endpre, HashMap<Integer, Integer> mp)
    {
        if(startpre>endpre || startin>endin){
            return null;
        }
        int k = preorder[startpre];
        int indexOfIn = mp.get(k);
        int leftLength = (indexOfIn-startin);
        TreeNode root = new TreeNode(k);
        root.left = builTrees(preorder, inorder, startin,indexOfIn-1,startpre+1, startpre+leftLength,mp);
        root.right = builTrees(preorder, inorder,  indexOfIn+1, endin,startpre+leftLength+1, endpre,mp);
        return root;
        
    }
}