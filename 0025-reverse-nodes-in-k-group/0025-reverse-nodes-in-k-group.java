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
    public ListNode reverseKGroup(ListNode head, int k) {

        // first check length
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        // first case 
        if (len < k) {
            // app ko kush karne ki jaruat nahi he 
            return head;
        }
        // first k len group me reverse karna he 
        ListNode prev = null;
        ListNode curr = head;

        for (int i = 1; i <= k; i++) {
            // isme pahle k groug ko reverse karo 
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        // remaining list ko recursion se solve kar ba liya 
        ListNode recursionKaAnsKaHead = reverseKGroup(curr, k);

        // join both List 
        head.next = recursionKaAnsKaHead;

        // linked list is reverse as per question demand 
        return prev;

    }
}