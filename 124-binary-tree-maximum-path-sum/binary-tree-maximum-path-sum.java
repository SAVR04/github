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
    public int maxpath(TreeNode root)
    {
        if(root==null)return 0;
        int maxl=Math.max(0,maxpath(root.left));
        int maxr=Math.max(0,maxpath(root.right));
        max=Math.max(max,root.val+maxl+maxr);
        return root.val+Math.max(maxl,maxr);

    }
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        int a= maxpath(root);
        return max;
        
        
    }
}