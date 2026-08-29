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

    public void lefttraversal(TreeNode root,ArrayList<Integer> answer)
    {
        if(root==null)
        {answer.add(101);
            return;}
        answer.add(root.val);
        lefttraversal(root.left,answer);
        lefttraversal(root.right,answer);

    }

    public void righttraversal(TreeNode root,ArrayList<Integer> answer)
    {
        if(root==null)
        {answer.add(101);
        return;}
        answer.add(root.val);
        righttraversal(root.right,answer);
        righttraversal(root.left,answer);

    }
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        ArrayList<Integer> answerleft=new ArrayList<>();
        ArrayList<Integer> answerright=new ArrayList<>();
        lefttraversal(root.left,answerleft);
        righttraversal(root.right,answerright);

        if(answerleft.size()!=answerright.size())return false;
        int size=answerleft.size();
        for(int i=0;i<size;i++)
        {
            if(answerright.get(i)!=answerleft.get(i))return false;
        }
        return true;
        
        
    }
}