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
    public TreeNode helper(TreeNode root,int low,int high)
    {
        if(root==null)return null;
        root.left=helper(root.left,low,high);
        root.right=helper(root.right,low,high);
        if(root.val<low)return root.right;
        if(root.val>high)return root.left;
        return root;
        // if(root.left==null && root.right==null)return root;
        // if(root.left!=null && root.left.val<low)root.left=helper(root.left,low,high);
        // else if(root.left!=null)
        // if(root.right!=null && root.right.val>high)root.right=helper(root.right,low,high);  
        // return root;
    }
    public TreeNode trimBST(TreeNode root, int low, int high) {
        TreeNode ans=helper(root,low,high);
        return ans;
        
    }
}