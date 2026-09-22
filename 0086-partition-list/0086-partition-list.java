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
        // Dummy Node 
        ListNode lesserHead = new ListNode(-1);
        ListNode lesserTail = lesserHead;

        //Dummy Node 
        ListNode greaterHead = new ListNode(-1);
        ListNode greaterTail = greaterHead;

        ListNode temp = head;

        while(temp != null){
            if(temp.val < x){
                // separate this node and append to lesser wali linked list 
                // also before doing this. make sure temp points to the head of remaing list
                ListNode nodeToInsert = temp;
                temp = temp.next;
                nodeToInsert.next = null;
                // insert at tail 
                lesserTail.next = nodeToInsert;
                lesserTail = nodeToInsert;

            }else{
                ListNode nodeToInsert = temp;
                temp = temp.next;
                greaterTail.next = nodeToInsert;
                greaterTail = nodeToInsert;
            }
        }
    // yaha per haumari dono sub list ready he 
    // join them
    lesserTail.next = greaterHead.next;
    greaterTail.next = null;

    // remove starting wail node 
    lesserHead = lesserHead.next;

    // return 
    return lesserHead;
       
    }
}