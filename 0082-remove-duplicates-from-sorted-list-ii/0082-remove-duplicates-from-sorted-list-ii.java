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
     ListNode dummy = new ListNode(0);
     dummy.next = head;

     ListNode pre = dummy;
     ListNode curr = head;

     while(curr != null){
        // duplicate mila
        if(curr.next !=null && curr.val == curr.next.val){
            // duplicate value ko remember karo
            int duplicate = curr.val;

            // jab tak same value hai agg badho 
            while(curr != null && curr.val == duplicate){
                curr = curr.next;
            }
    // saare duplicates ko skip karo 
    pre .next = curr;
        }
        else{
            // unique node hai 
            pre = curr;
            curr = curr.next;
        }
     }   
     return dummy.next;
    }
}