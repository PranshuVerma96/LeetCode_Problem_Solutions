class Solution {
    public int minAddToMakeValid(String s) {
        Deque<Character> st = new ArrayDeque<>();

        int addtion = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch);
            }
            else{
                // ager vo opening bracket nahi he to vo closing bracket he hoga 
                // to muge is ke liye stack se oepen bracket ho hata hoga 
                if(st.isEmpty()){
                    addtion++;
                }
                else{
                    // stack empty nahi he 
                    // opennning bracke the 
                    st.pop();
                }

            }
        }
        // final answer addtion and st.size
        // addtion number of opening bracket needed extra 
        // number of closing braket needed 
        int finalAns = addtion + st.size();
        return finalAns;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna