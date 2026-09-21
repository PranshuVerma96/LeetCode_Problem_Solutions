/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */class Solution {
    public ListNode partition(ListNode head, int x) {

        // Dummy nodes
        ListNode lesserHead = new ListNode(-1);
        ListNode lesserTail = lesserHead;

        ListNode greaterHead = new ListNode(-1);
        ListNode greaterTail = greaterHead;

        ListNode temp = head;

        while (temp != null) {

            ListNode nodeToInsert = temp;
            temp = temp.next;
            nodeToInsert.next = null;

            if (nodeToInsert.val < x) {

                // Add to lesser list
                lesserTail.next = nodeToInsert;
                lesserTail = nodeToInsert;

            } else {

                // Add to greater list
                greaterTail.next = nodeToInsert;
                greaterTail = nodeToInsert;
            }
        }

        // Join both lists
        lesserTail.next = greaterHead.next;

        // Return actual head, not dummy node
        return lesserHead.next;
    }
}