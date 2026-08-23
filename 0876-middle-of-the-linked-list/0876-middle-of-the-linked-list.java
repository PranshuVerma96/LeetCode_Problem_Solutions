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
        int size =0;
        ListNode temp = head;

        // traversal
        while(temp !=null){
            size++;
            temp = temp.next;
        }

        // step 2 second mille ke liye 
        int middle = size/2;
        temp = head;
        for(int i=0; i<middle; i++){
            temp = temp.next;
        }
        return temp;
    }
}