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
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head; 

        while(fast != null){
            // fast ko ek bar age cala do 
            fast = fast.next;
            // phir check karo fast null to nahi ho gaya
            if(fast != null){
                fast = fast.next;
                slow = slow.next;
            }
        }
        // pura process hone ke bad slow mid per hoga 
        return slow;
    }
}