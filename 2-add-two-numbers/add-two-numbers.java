class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode up = l1;
        ListNode down = l2;
        ListNode answer = null;
        ListNode temp = null;
        int carry = 0;

        while (up != null && down != null) {
            int ans = up.val + down.val + carry;
            carry = ans / 10;
            ListNode newNode = new ListNode(ans % 10);
            
            if (answer == null) {
                answer = newNode;
                temp = answer;
            } else {
                temp.next = newNode;
                temp = temp.next;
            }
            
            up = up.next;
            down = down.next;
        }

        while (up != null) {
            int ans = up.val + carry;
            carry = ans / 10;
            ListNode newNode = new ListNode(ans % 10);
            
            if (answer == null) {
                answer = newNode;
                temp = answer;
            } else {
                temp.next = newNode;
                temp = temp.next;
            }
            
            up = up.next;
        }

        while (down != null) {
            int ans = down.val + carry;
            carry = ans / 10;
            ListNode newNode = new ListNode(ans % 10);
            
            if (answer == null) {
                answer = newNode;
                temp = answer;
            } else {
                temp.next = newNode;
                temp = temp.next;
            }
            
            down = down.next;
        }

        if (carry > 0) {
            temp.next = new ListNode(carry);
        }

        return answer;
    }
}
