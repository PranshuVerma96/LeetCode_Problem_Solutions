/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
       
       // first check list null to nahi he
       if(head == null){
        return null;
       }
       // step 1 clone nodes add
       Node temp = head;
       while(temp != null){
        Node cloneNode = new Node(temp.val);
        cloneNode.next = temp.next;
        temp.next = cloneNode;
        temp = cloneNode.next;
       }
       // step 2 copy random poniters
       temp = head;
       while(temp != null){
        Node oldNode = temp;
        Node newNode = temp.next;

        // Obeservation NewNode ka random = oldNode ka random ka next
        if(oldNode.random != null){
            newNode.random = oldNode.random.next;

        }
        // temp ka move krna pdega aage 
        temp = newNode.next;

       }

       // step 3 detach the list
       temp = head;
       Node ansListHead = head.next;

       while(temp != null){
        Node oldNode = temp;
        Node cloneNode = temp.next;

        // detach ka logic 
        oldNode.next = cloneNode.next;
        if(cloneNode.next != null){
        cloneNode.next = cloneNode.next.next;

        }
        // temp ko move karo 
        temp = temp.next;
       }
       return ansListHead;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna