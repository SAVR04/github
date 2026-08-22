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

 class Tuple{
    TreeNode root;
    int row;
    int col;
    Tuple(TreeNode _root,int _row,int _col)
    {
        root=_root;
        row=_row;
        col=_col;
    }
 }
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> answer =new ArrayList<>();
        if(root==null)return answer;
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map=new TreeMap<>();
        Queue<Tuple> q=new LinkedList<>();

        q.offer(new Tuple(root,0,0));
        while(!q.isEmpty())
        {
            Tuple tuple=q.poll();
            TreeNode node=tuple.root;
            int x=tuple.col;
            int y=tuple.row;


        if(!map.containsKey(x))
        {
            map.put(x,new TreeMap<>());
        }
        if(!map.get(x).containsKey(y))
        {
            map.get(x).put(y,new PriorityQueue<>());
        }
        map.get(x).get(y).offer(node.val);
        
        if(node.left!=null)
        {
            q.offer(new Tuple(node.left,y+1,x-1));
        }
        if(node.right!=null)
        {
            q.offer(new Tuple(node.right,y+1,x+1));
        }   
        }  
      
        for(TreeMap<Integer,PriorityQueue<Integer>> sub: map.values())
        {
            answer.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes: sub.values())
            {
                while(!nodes.isEmpty())
                {
                    answer.get(answer.size()-1).add(nodes.poll());
                }
            }
        }

        return answer;
    }
}