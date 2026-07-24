class Solution {

    public int countNegatives(int[][] grid) {

        int totalRow = grid.length;
        int totalCol = grid[0].length;

        int count = 0;

        for (int i = 0; i < totalRow; i++) {

            int firstNegative = firstNegativeIndex(grid[i]);

            if (firstNegative != totalCol) {
                count += totalCol - firstNegative;
            }
        }

        return count;
    }

    static int firstNegativeIndex(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] < 0) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }
}