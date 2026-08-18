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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null)return true;
        if(head.next.next==null)
        {
            if(head.next.val==head.val)return true;
            return false;
        }
    //   Stack<ListNode> st=new Stack<>();
    //   st.push(head);
    //   ListNode slow=head.next;
    //   ListNode fast=head.next.next;
    //   while(fast!=null &&fast.next!=null)
    //   {
    //     st.push(slow);
    //     slow=slow.next;
    //     fast=fast.next.next;
    //   }
    //   if(st.size()%2!=0)st.push(slow.next);
    //   slow=slow.next;
    //   System.out.println(st);
    //   while(slow!=null && !st.isEmpty())
    //   {
    //     ListNode temp=st.pop();
    //     if(temp.val!=slow.val)return false;
    //     slow=slow.next;
    //   }
    //   return true;
    // }
    List<Integer> answer=new ArrayList<>();
    ListNode curr=head;
    while(curr!=null)
    {
        answer.add(curr.val);
        curr=curr.next;
    }
    int start=0;
    int end=answer.size()-1;
    while(start<=end)
    {
        if(answer.get(start)!=answer.get(end))return false;
        start++;
        end--;
    }
    return true;
    }
}