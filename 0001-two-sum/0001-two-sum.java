class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i =0; i<= n-1; i++){
            for(int j = i+1; j<n; j++){
                if(nums[i] + nums[j] == target){
                    // int ans = [arr[i] , arr[j]] for element value 
                    int indexs []= {i , j};
                    return indexs;
                 }
            }
        }
        // for return yaha tak loop kabi nahi ayega 
        int ans [] = {};
        return ans;
    }
}