class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ans.length() >0 && ans.charAt(ans.length()-1) == ch){
                ans.deleteCharAt(ans.length()-1);
            }
            else {
                // apend kar do 
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna