class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int n = nums.length;
        // find the average of first slid 
       
        double sum =0;
        for(int i=0; i<k; i++){
            sum += nums[i];
            
        }
       
        double maxSum = sum;

        // for check in the full slide 
        for(int i=k; i<n; i++){
         
         sum = sum - nums[i-k] + nums[i];

            maxSum = Math.max(sum, maxSum);
        }
        double average = maxSum/k;
        return average;
        
    }
}