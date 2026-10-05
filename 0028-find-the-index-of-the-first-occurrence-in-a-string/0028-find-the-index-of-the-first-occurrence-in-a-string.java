class Solution {
    public int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        if (m > n) {
            return -1;
        }

        for (int i = 0; i <= n - m; i++) {
            for (int j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
                     if (j == m-1)  return i;

            }
        }

        return -1;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna