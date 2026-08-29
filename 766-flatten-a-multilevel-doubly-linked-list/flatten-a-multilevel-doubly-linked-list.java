/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flattenchild(Node head)
    {
        if(head==null)return head;
        Node curr=head;
        while(curr.next!=null)
        {
            if(curr.child==null)
            {
                curr=curr.next;
                continue;
            }
            Node newchild=curr.child;
            Node temp=curr.next;
            curr.next=curr.child;
            curr.child.prev=curr;
            curr.child=null;


            Node tail=flattenchild(newchild);

            tail.next=temp;
            temp.prev=tail;
            curr=temp; 

        }
        if(curr.next==null && curr.child!=null)
        {
            Node currchild=curr.child;
            curr.next=curr.child;
            curr.child.prev=curr;
            curr.child=null;
            Node tail=flattenchild(currchild);
            tail.next = null; 
            curr = tail; 
        }
        return curr;
    }
    public Node flatten(Node head) {
        if(head==null)return head;
        flattenchild(head);
        return head;
        
    }
}