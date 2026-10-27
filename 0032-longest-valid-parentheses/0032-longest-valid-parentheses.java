class Solution {
    public int longestValidParentheses(String s) {
        Deque<Integer> st = new ArrayDeque<>();

        // inlitize stage ke maintain karne ke liye
        st.push(-1);
        int maxLen = 0;

        //  ager travale string 
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                // open bracket he chup chap push kar do 
                st.push(i);

            } else {
                // isa nahi he 
                st.pop();
                // ager jo pop hua he vo ek open bracekt ka index nahi tha 
                // stack empty ho gay he 
                // isaka matalb stack empty he 
                if (st.isEmpty()) {
                    // invalid case 
                    // reset kardo 
                    // left string part ko neglect kar and new left boundary set kardo kage bado 
                    st.push(i);
                } else {
                    // valid case 
                    int currLen = i - st.peek();
                    maxLen = Math.max(maxLen, currLen);

                }

            }
        }

        return maxLen;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna