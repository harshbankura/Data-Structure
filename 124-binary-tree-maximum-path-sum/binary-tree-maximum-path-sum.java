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
    private int max=Integer.MIN_VALUE;
    private  int dfs(TreeNode root){
        if(root==null){
            return 0;
        };
        int leftm=Math.max(0, dfs(root.left));
        int rightm= Math.max(0,dfs(root.right));
        int curr= root.val + rightm + leftm;
        max=Math.max(max,curr);
        return root.val + Math.max(leftm,rightm);
    };
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
        
        
    }
}