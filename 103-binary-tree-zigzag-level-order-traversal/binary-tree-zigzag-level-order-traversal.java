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
        Queue<TreeNode> qt=new LinkedList<>();
        List<List<Integer>> answer=new ArrayList<>();
        if(root==null)return answer;
        qt.offer(root);
        boolean flag=false;
        while(!qt.isEmpty())
        {
            int size=qt.size();
            List<Integer> subanswer=new LinkedList<>();
            for(int i=0;i<size;i++)
            {
                TreeNode current=qt.poll();
                if(flag)
                {
                  subanswer.add(0,current.val);  
                }
                else
                {
                    subanswer.add(current.val);
                }
                if(current.left!=null)qt.offer(current.left);
                if(current.right!=null)qt.offer(current.right);
            }
            flag=!flag;
            answer.add(subanswer);
        }
        return answer;
        
    }
}