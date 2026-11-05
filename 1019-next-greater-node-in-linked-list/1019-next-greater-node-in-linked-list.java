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
    public int[] nextLargerNodes(ListNode head) {
        //  linked list ko array me convert karege 
        List<Integer> list = new ArrayList<>();
        Deque<Integer> st = new ArrayDeque<>();


        ListNode temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        // main logic 
        int n = list.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            // for each element index we will get the next greater element
            // agar mara current and i index baa element stack k top pr index h
            // usse element ki value se bad hai to mught stack k top k index ki ka answer milaga
            // answer sotre krilla stak ka pip ko pop kardia
            while (!st.isEmpty() &&  list.get(i) > list.get(st.peek())) {
                int prevValue = st.pop();
                ans[prevValue] = list.get(i);

            }
            //  baki curr element ka sotre to karna padega 
            st.push(i);
        }
        return ans;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna