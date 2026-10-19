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
    public ListNode helper(ListNode head)
    {
        if(head==null)return null;
        if(head.next==null)return head;
        ListNode tempnext=head.next.next;
        ListNode temp=head.next;
        temp.next=head;
        head=temp;
        head.next.next=helper(tempnext);
        return head;

    }
    public ListNode swapPairs(ListNode head) {
        ListNode root=helper(head);
        return root;
        
    }
}