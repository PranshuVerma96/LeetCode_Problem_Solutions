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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

         // if head hi null he
        if(head == null){
            return new int[]{-1,-1};
        }
        ListNode prev = head;
        ListNode curr = head.next;

        int i = 1; 
        List<Integer> criticalPoints = new ArrayList<>();

        while(curr != null && curr.next != null){
            // compare local maxima
            if(curr.val > prev.val && curr.val > curr.next.val){
                criticalPoints.add(i);
            }
        
        // minima
        if(curr.val < prev.val && curr.val < curr.next.val){
            criticalPoints.add(i);
        }

        curr = curr.next;
        prev= prev.next;
        i = i+1;
        
    }
    // is critical points 2 se kam he to 
    if(criticalPoints.size()<2)

    {
        return new int[] { -1, -1 };
    }

    // baher ane per criticalPonits List ready hogi 
    int minDistance = Integer.MAX_VALUE;

    for(
    int j = 1;j<criticalPoints.size();j++)
    {
        minDistance = Math.min(minDistance, criticalPoints.get(j) - criticalPoints.get(j - 1));

    }

    int maxDistance = criticalPoints.get(criticalPoints.size() - 1) - criticalPoints.get(0);

    return new int[]{minDistance,maxDistance};

}}