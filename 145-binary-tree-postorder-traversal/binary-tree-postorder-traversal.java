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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> r = new ArrayList<>();
        helper(root,r);
        return r;

        
    }
    private void helper(TreeNode root , List<Integer> r){
        if(root==null)return;
        helper(root.left,r);
        helper(root.right,r);
        r.add(root.val);
    }
}