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
    public ListNode mergeNodes(ListNode head) {
        ListNode read = head.next;
        ListNode write = head;

        while(read != null){
            int sum = 0;

            while(read.val != 0){
                sum = sum +read.val;
                read = read.next;
            }
            // insert sum ki value on write postion per 
            write.val = sum;
            //delete faitu nodes
            write.next = read.next;
            // read and write ko move  kardo 1 tep
            read  = read.next;
            write = write.next;
            // ye node delte kar dega 
        }
        return head;
    }
}