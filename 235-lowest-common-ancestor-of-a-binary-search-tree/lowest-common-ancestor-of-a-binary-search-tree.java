/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val>q.val){
            TreeNode temp=p;
            p=q;
            q=temp;
        }
        while(root!=null){
            if(q.val<root.val){
                root=root.left;
            }else if(p.val>root.val){
                root=root.right;
            }else{
                return root;
            }
        }
        return null;
        
    }
}