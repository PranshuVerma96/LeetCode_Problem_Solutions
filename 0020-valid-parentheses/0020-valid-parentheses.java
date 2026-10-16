import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {
        Deque<Character> st = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {

            // If opening bracket, push onto stack
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } 
            else {
                // If stack is empty, no matching opening bracket
                if (st.isEmpty()) {
                    return false;
                }

                // Check matching brackets
                if (ch == ')' && st.peek() != '(') {
                    return false;
                } 
                else if (ch == ']' && st.peek() != '[') {
                    return false;
                } 
                else if (ch == '}' && st.peek() != '{') {
                    return false;
                }

                // Remove the matching opening bracket
                st.pop();
            }
        }

        // Valid only if all opening brackets are matched
        return st.isEmpty();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna