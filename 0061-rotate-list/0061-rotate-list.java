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
    public ListNode rotateRight(ListNode head, int k) {
        // step 1 make it circluar and find lenght of list 
        if(head == null || k==0){
            return head;
        }
        int len = 1;
        ListNode temp = head;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        // make it circular 
        temp .next = head;

        // k ko update kar do 
        k = k % len;
        // step link break and set forward 
        temp = head;
        for(int i=1; i<= len-k-1; i++){
            temp = temp.next;
        }
        ListNode forword = temp.next;

        // line break 
        temp.next = null;
        return forword;
    }
}