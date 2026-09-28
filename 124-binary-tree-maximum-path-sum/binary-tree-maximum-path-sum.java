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
    int cost=Integer.MIN_VALUE;
    public int helper(TreeNode root)
    {
        if(root==null)return 0;
       int left= Math.max(0,helper(root.left));
       int right=Math.max(0,helper(root.right));
       cost=Math.max(cost,root.val+left+right);
       return root.val+Math.max(left,right);
    }
    public int maxPathSum(TreeNode root) {
      int a=helper(root);
       return cost;
    }
}