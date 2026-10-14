class Solution {
    public int[] plusOne(int[] digits) {

        // first loop to traverse 
        for(int i= digits.length - 1; i>=0; i--){
            if(digits[i] == 9){
                digits[i] = 0;
            }
            else{
            // nahi isa ho 
            digits[i]++;
            return digits;
        }
        
        }
        // jab return na ho 

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna