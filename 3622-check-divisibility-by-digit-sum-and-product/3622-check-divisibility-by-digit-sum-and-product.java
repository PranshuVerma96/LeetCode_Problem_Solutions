class Solution {
    public boolean checkDivisibility(int n) {

        int sum = 0;
        int multiply = 1;
        int original = n;
        while (n > 0) {

            int digit = n % 10;
            n = n / 10;

            sum += digit;
            multiply *= digit;
        }
        if (original % (sum + multiply) == 0) {
            return true;
        } else {
            return false;
        }
    }

}