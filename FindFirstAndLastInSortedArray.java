class Solution {

    static int firstOccurance(int arr[],int target){
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        int ans = n;

        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] >= target){
                // move to right 
                ans = mid; 
                end = mid - 1;  
            }
            else{
                // move to left 
                start = mid +1;

            }
           
        }
         return ans;
    }

    static int lastOccurance(int arr[], int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] <= target){
                // move to left 
                ans = mid;
               start = mid +1;
            
            }
            else{
                // move to right
                end = mid -1;
            }

        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurance(nums , target);

        // target not found 
        if(first == nums.length || nums[first] != target){
            return new int[]{-1,-1};
        }
        int last = lastOccurance(nums , target);

        return new int[]{first, last};
    }
   
}
