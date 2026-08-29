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

    public void backtrack(TreeNode root,TreeMap<Integer,Integer> map,int depth)
    {
        if(root==null)return;
        if(!map.containsKey(depth))
        {
            map.put(depth,root.val);
        }
        backtrack(root.right,map,depth+1);
        backtrack(root.left,map,depth+1);
    }



    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> answer=new ArrayList<>();
        if(root==null)return answer;
        TreeMap<Integer,Integer> map=new TreeMap<>();
        backtrack(root,map,0);

        for(int x: map.values())
        {
            answer.add(x);
        }
        return answer;
    }
}