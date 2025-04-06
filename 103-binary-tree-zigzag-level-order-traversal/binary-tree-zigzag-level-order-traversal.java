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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null)return result;
        boolean flag=true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
    while(!queue.isEmpty()){
        List<Integer> list = new ArrayList<>();
        int n = queue.size();
        for(int i=0;i<n;i++){
            TreeNode curr= queue.poll();
            if(flag){
                list.add(curr.val);
            }else{
                list.add(0,curr.val);
            };
            if(curr.left!=null) queue.offer(curr.left);
            if(curr.right!=null) queue.offer(curr.right);
            
        }
        flag=!flag;
        result.add(list);
    }
    return result;
        
    }
}