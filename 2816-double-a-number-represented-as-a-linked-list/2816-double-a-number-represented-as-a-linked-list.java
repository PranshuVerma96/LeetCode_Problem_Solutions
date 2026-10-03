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
    // reverse function 
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;

        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        // actual logic
        // step1 reverse inked list
        head = reverse(head);
        // step2 do some math
        ListNode temp = head;

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        int carry = 0;
        while(temp != null){
            int value = temp.val;
            int sum = value + value + carry;
            int digit = sum % 10;
            // add this node to dummy bali linked list 
            curr.next = new ListNode(digit);
            curr = curr.next;

            // carry findout
            carry = sum / 10;

            temp = temp.next;
        }
        // extra condtion 
        if(temp == null && carry!=0){
            curr.next = new ListNode(carry);
        }

        // step 3 reverse 
        // before reverse I have to remove the dummy node 
        dummy = dummy.next;

        head = reverse(dummy);
        return head;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna