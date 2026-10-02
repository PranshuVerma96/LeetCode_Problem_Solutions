class Solution {
    public boolean checkIfPangram(String sentence) {
        // sabse phle check karo length

        int length = sentence.length();

        // boolean arr[26] = false;
        boolean[] arr = new boolean[26];
        int count =0;

        for(int i =0; i<length; i++){
            char ch =sentence.charAt(i);
            // index findout karo 

            // alphabet ka index find out karo
            int index = ch- 'a';

            if(arr[index] == false){
                count++;
                // index per true dal dege
                arr[index] = true;

            }

            // uske bad check kare ge count 26 to nahi he
            // pura loop me check karne ki jaratu nahi he
        
            if(count == 26){
                return true;
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna