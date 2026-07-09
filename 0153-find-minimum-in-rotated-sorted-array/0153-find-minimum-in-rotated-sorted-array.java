class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int n = nums.length;
        int end = n-1;
        int ans = -1;

        // check first iteration 
        if(nums[start]<nums[end]){
            return nums[start];
        }
        while(start < end){
           // find mid 
           int mid = start + (end - start)/2;

           if(nums[mid] > nums[n-1]){
               // move to the 
             
               start = mid +1;
           } 
           else {
            // if(nums[mid] > nums[n-1])
            end = mid;
           }

        }
        return nums[start];
    }
}