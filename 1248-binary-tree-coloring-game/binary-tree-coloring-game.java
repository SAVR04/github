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
    private int leftBranchSize = 0;
    private int rightBranchSize = 0;
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        countNodes(root, x);
        int parentBranchSize = n - leftBranchSize - rightBranchSize - 1;
        int bestChoice = Math.max(parentBranchSize, Math.max(leftBranchSize, rightBranchSize));
        return bestChoice > n / 2;
    }
    private int countNodes(TreeNode node, int x) {
        if (node == null) {
            return 0;
        }
        int leftCount=countNodes(node.left, x);
        int rightCount=countNodes(node.right, x);
        if (node.val==x){
            this.leftBranchSize=leftCount;
            this.rightBranchSize=rightCount;
        }
        return leftCount+rightCount+1;
    }
}
