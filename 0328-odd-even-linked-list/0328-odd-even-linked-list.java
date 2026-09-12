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
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return head;
        }

        if(head.next == null){
            return head;
        }
        //  if >1 node 
        // link rearange 
        ListNode oddHead = head;
        ListNode oddTail = head;
        ListNode evenHead = head.next;
        ListNode evenTail = head.next;
        while(evenTail != null && evenTail.next != null){
            oddTail.next = evenTail.next;
            oddTail = evenTail.next;

            evenTail.next = oddTail.next;
            evenTail = oddTail.next;
        }

        // conver list 
    oddTail.next = evenHead;
    // return head of modified list
    return oddHead;
    }
}