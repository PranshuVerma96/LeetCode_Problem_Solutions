class Solution {
    public boolean isPalindrome(int x) {
    
    if(x < 0){
        return false;
    }

   int original = x;
    int reverseNum = 0;
    while(x >0){
        // step 1 find the first last digit
        int lastDigit = x % 10;

        // add in the reverse num 
        reverseNum = reverseNum*10 + lastDigit;

        // revmove the last digit
        x = x/10;
    }
    if(original == reverseNum){
        return true;
    }
    else{
        return false;
    }
        
    
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna