class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;

        int numRows = strs.length;
        int numCols = strs[0].length();

        for (int j = 0; j < numCols; j++) {

            for (int i = 0; i < numRows - 1; i++) {

                if (strs[i].charAt(j) > strs[i + 1].charAt(j)) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna