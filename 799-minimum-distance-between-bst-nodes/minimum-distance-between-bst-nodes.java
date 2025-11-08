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
     public int minDiffInBST(TreeNode root) {        
        int[] res = new int[]{Integer.MAX_VALUE};
        minDiffInBST(root, new LinkedList<>(), res);
        return res[0];
    }

    public void minDiffInBST(TreeNode root, LinkedList<Integer> list, int[] res) {
        if (root.left != null) minDiffInBST(root.left, list, res);
        if (!list.isEmpty() && root.val - list.getLast() < res[0]) {
            res[0] = root.val - list.getLast();
        }
        list.add(root.val);
        if (root.right != null) minDiffInBST(root.right, list, res);
    }


    public int minDiffInBST2(TreeNode root) {        
        int[] res = new int[]{Integer.MAX_VALUE};
        Integer[] pre = new Integer[]{null};
        minDiffInBST2(root, new LinkedList<>(), pre, res);
        return res[0];
    }

    public void minDiffInBST2(TreeNode root, LinkedList<Integer> list, Integer[] pre, int[] res) {
        if (root.left != null) minDiffInBST2(root.left, list, pre, res);
        if (pre[0] != null && root.val - pre[0] < res[0]) {
            res[0] = root.val - pre[0];
        }
        pre[0] = root.val;
        if (root.right != null) minDiffInBST2(root.right, list, pre, res);
    }
}