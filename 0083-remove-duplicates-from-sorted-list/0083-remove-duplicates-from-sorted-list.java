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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        if(head.next == null){
            return head;
        }
        // check where > 1 node 
        // first of all we have to inilitize 
        ListNode prev = head;
        ListNode curr = head.next;

      
        // check value 
      while(curr != null){
        if(prev.val != curr.val){
            prev = prev.next;
            curr = curr.next;
        }
        else{
            prev.next = curr.next;
            curr = curr.next;
        }
      }
      // linked list me sare duplicate remove ho cuke hoge 
      return head;
    }
}