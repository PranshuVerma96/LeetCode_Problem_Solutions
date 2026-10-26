// class Solution {
//     public String removeDuplicates(String s) {
//         StringBuilder ans = new StringBuilder();

//         for(int i=0; i<s.length(); i++){
//             char ch = s.charAt(i);
//             if(ans.length() >0 && ans.charAt(ans.length()-1) == ch){
//                 ans.deleteCharAt(ans.length()-1);
//             }
//             else {
//                 // apend kar do 
//                 ans.append(ch);
//             }
//         }
//         return ans.toString();
//     }
// }

class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> st = new ArrayDeque<>();

        for (char ch : s.toCharArray()) {
            if (!st.isEmpty()) {
                // check karo stack ke top element se 
                if (st.peek() == ch) {
                    // remove karo 
                    st.pop();
                } else {
                    // not equal push karo do chup chap
                    st.push(ch);
                }

            } else {
                // stack is empty 
                st.push(ch);
            }

        }
        // stack agar empty he return empty string as a answer 
        // non empty h to create a srting using stack element 
        // and reverse and return the string 
        StringBuilder str = new StringBuilder();

        while (!st.isEmpty()) {
            str.append(st.peek());
            st.pop();
        }
        // return reverse kar ke return karna he 
        return str.reverse().toString();

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna