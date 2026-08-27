class Node{
    int val;
    Node next;
    Node(int x)
    {
        val=x;
        next=null;
    }
}

class Solution {
    public int findTheWinner(int n, int k) {
        Node head=new Node(1);
        Node curr=head;
        for(int i=1;i<n;i++)
        {
            Node temp=new Node(i+1);
            curr.next=temp;
            curr=curr.next;
        }
         Node prev=curr;
        curr.next=head;
       
        curr=head;
        
        int i=1;
        while(curr.next!=curr)
        {
            if(i==k)
            {
                prev.next=curr.next;
                curr=curr.next;
                i=1;
            }
            else
            {
            prev=curr;
            curr=curr.next;
            i++;
            }
            
            
        }
        return curr.val;
        
        
    }
}