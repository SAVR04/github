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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode curr=head;
        ListNode end=head;
        while(end!=null)
        {
            if(curr.val!=end.val)
            {
            curr.next=end;
            curr=end;
            }
            end=end.next;
        }
        curr.next=null;
        return head;
        
    }
}