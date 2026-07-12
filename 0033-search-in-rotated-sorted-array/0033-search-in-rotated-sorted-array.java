class Solution {
    static int findPivot(int arr[]){
        int start = 0;
        int n = arr.length;
        int end = n-1;
        int ans = -1;
        
        // check first array is sorted 
        if(arr[start] < arr[end]){
            return -1;
        }
        
        // after that check the loop
        while(start <= end){
            int mid = start + (end - start)/2;
            // check if mid cota he last element se 
            if(arr[mid] <= arr[n-1]){
                // element left me he 
                end = mid - 1;
            }else{
                ans = mid;
                start = mid + 1;
            }
        }
        return ans;
    }
    static int binarySearch(int arr[],int start,int end,int target){
       
        
        while(start <=end){
            int mid = start + (end - start)/2;

            //check 
            if(arr[mid] ==target){
                return mid;

            }else if(target >  arr[mid]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
         int pivotIndex = findPivot(nums);
        int n = nums.length;
        int ans = -1;
        // if pivotIndex = -1 then array is already sorted

        if(pivotIndex == -1){
             ans = binarySearch(nums,0,n-1 ,target);

        }
        else{
            // array is rotated sorted
            // indexes for l1
            int startArray1 = 0;
            int endArray1 = pivotIndex;
            if(target >= nums[startArray1] && target<=nums[endArray1]){
                 ans = binarySearch(nums, startArray1, endArray1,target);

            }

            // indexes for l1

            int startArray2 = pivotIndex + 1;
            int endArray2 = n-1;

            if(target >=nums[startArray2] && target<=nums[endArray2]){
                 ans = binarySearch(nums, startArray2, endArray2, target);

            }

        }
        
     return ans;
    }
   
}