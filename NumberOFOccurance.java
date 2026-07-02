public class NumberOFOccurance {
    static int findLowerBound(int arr[], int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= target) {
                ans = mid;

                // move to left
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static int findUpperBound(int arr[], int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= target) {
                // move to right
                start = mid + 1;
            } else {
                // move to left

                ans = mid;
                end = mid - 1;
            }

        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,5,5,6};
        int target  = 5;
        int result = findLowerBound(arr, target);
        int result1 = findUpperBound(arr , target);
//        System.out.println("the Upper bound is => " + result1);
//        System.out.println("the lowwer Bound is := " + result);

        int numOfOccurance = result1 - result;
        System.out.println("the number of occurance is " + numOfOccurance);
    }
}
