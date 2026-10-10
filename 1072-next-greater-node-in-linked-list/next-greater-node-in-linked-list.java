/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> st=new Stack<>();
        ArrayList<Integer> answer=new ArrayList<>();
        ListNode curr=head;
       while(curr!=null)
       {
        answer.add(curr.val);
        curr=curr.next;
       }
       int n=answer.size();
       int[] ans=new int[n];
       for(int i=0;i<n;i++)
       {
        while(!st.isEmpty() && answer.get(st.peek())<answer.get(i))
        {
            int prev=st.pop();
            ans[prev]=answer.get(i);
        }
        st.push(i);
       }
       return ans;
    }
}