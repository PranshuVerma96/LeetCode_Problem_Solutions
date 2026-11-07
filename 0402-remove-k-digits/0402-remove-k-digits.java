class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> st = new ArrayDeque();

        // apply monotonic stack patteren on input string
        for (char ch : num.toCharArray()) {
            while (k > 0 && !st.isEmpty() && st.peek() > ch) {
                st.pop();
                k--;
            }
            // inser the current character
            st.push(ch);
        }

        // step 2 kusch removole ho to takte care 
        while (k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }

        // step 3 build your answer reverse it reove the leading zeroes
        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.append(st.peek());
            st.pop();
        }

        // reverse string builder
        ans.reverse();

        // remove the leading zeroes
        int index = 0;
        while (index < ans.length() && ans.charAt(index) == '0') {
            index++;
        }
        String result = ans.substring(index);

        if (result.length() == 0) {
            return "0";
        } else {
            return result;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna