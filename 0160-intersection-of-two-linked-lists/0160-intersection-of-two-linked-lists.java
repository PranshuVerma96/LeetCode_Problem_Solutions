public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        // Find length of List A
        int lenA = 0;
        ListNode a = headA;

        while (a != null) {
            lenA++;
            a = a.next;
        }

        // Find length of List B
        int lenB = 0;
        ListNode b = headB;

        while (b != null) {
            lenB++;
            b = b.next;
        }

        // Move longer list ahead
        if (lenA > lenB) {
            int diff = lenA - lenB;

            while (diff-- > 0) {
                headA = headA.next;
            }
        } 
        else {
            int diff = lenB - lenA;

            while (diff-- > 0) {
                headB = headB.next;
            }
        }

        // Find intersection
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }
}