/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {

        // sabse pile chek karo linked list null to nahi he
        if (head == null) {
            return head;
        }

        Node p = head;
        while (p != null) {
            if (p.child == null) {
                p = p.next;
            } else {
                // p has a child 
                Node temp = p.child;
                while (temp.next != null) {
                    temp = temp.next;
                }
                // link manilulation 
                temp.next = p.next;

                if (p.next != null) {
                    p.next.prev = temp;
                }

                p.next = p.child;
                p.child.prev = p;

                p.child = null;
            }
        }
        // return 
        return head;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna