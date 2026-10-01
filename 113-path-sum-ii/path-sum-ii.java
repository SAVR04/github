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
    public void helper(TreeNode root,int sum,List<List<Integer>> answer,List<Integer> subanswer)
    {
        if(root==null)return;
        subanswer.add(root.val);
      
        if(root.left==null && root.right==null && sum==root.val)
        {
            answer.add(new ArrayList<>(subanswer));
            subanswer.remove(subanswer.size()-1);
            return;
        }
        helper(root.left,sum-root.val,answer,subanswer);
        helper(root.right,sum-root.val,answer,subanswer);
        subanswer.remove(subanswer.size()-1);
        

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> answer=new ArrayList<>();
        if(root==null)return answer;
        helper(root,targetSum,answer,new ArrayList<>());
        return answer;
        
        
    }
}