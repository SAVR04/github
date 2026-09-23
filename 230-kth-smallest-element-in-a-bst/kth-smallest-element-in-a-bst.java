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
    public void smallest(TreeNode root,int k)
    {
        if(root==null)return;
        smallest(root.left,k);
        count++;
        if(count==k)answer=root.val;
        smallest(root.right,k);
    }
    int answer=0;
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        smallest(root,k);
        return answer;
        // if(root==null)return 0;
        // int count=1;
        // Stack<Integer> st=new Stack<>();
        // st.push(root.val);
        // while(count<=k && st.isEmpty())
        // {
        //     Node temp=st.pop();


        // }
        
        
    }
}