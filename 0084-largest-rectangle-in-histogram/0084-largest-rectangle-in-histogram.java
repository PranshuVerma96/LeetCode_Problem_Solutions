class Solution {

    public void findPreviousSmallerIndex(int[] heights, int[] prev) {

        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < heights.length; i++) {

            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                prev[i] = -1;
            } else {
                prev[i] = st.peek();
            }

            st.push(i);
        }
    }

    public void findNextSmallerIndex(int[] heights, int[] next) {

        Deque<Integer> st = new ArrayDeque<>();
        int n = heights.length;

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                next[i] = n;
            } else {
                next[i] = st.peek();
            }

            st.push(i);
        }
    }

    public int largestRectangleArea(int[] heights) {

        int n = heights.length;

        int[] prev = new int[n];
        int[] next = new int[n];

        findPreviousSmallerIndex(heights, prev);
        findNextSmallerIndex(heights, next);

        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            int height = heights[i];

            int width = next[i] - prev[i] - 1;

            int area = height * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna