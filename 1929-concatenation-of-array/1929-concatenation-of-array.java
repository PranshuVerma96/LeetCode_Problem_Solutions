class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = nums.length;

       int[] ans = new int[2 * length];
        for(int i =0; i<length; i++){
            ans[i]= nums[i];
            ans[i + length] = nums[i];
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna