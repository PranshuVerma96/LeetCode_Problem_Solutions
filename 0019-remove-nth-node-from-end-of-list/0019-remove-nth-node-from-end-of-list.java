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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = dummy;

        // curr ko n+1 steps aage le jao
        for(int i = 0; i <= n; i++) {
            curr = curr.next;
        }

        // window move karo
        while(curr != null) {
            curr = curr.next;
            prev = prev.next;
        }

        // Nth node ko remove karo
        prev.next = prev.next.next;

        return dummy.next;
    }
}