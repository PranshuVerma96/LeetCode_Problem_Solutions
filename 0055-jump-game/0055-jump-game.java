class Solution {
    // static boolean solve(int nums[], int index){
    //     // first of base case 
    //     if(index == nums.length-1){
    //         return true;
    //     }
    //     if(index >= nums.length){
    //         return false;
    //     }
    //     // stack case where index value is 0 
    //     if(nums[index]==0){
    //         return false;
    //     }

    //     // final approach 
    //     boolean overAllAns = false;
    //     int jumpValue =  nums[index];
    //     for(int jump=1; jump<=jumpValue; jump++){
    //         boolean recAns = solve(nums,index+jump);
    //         overAllAns = overAllAns || recAns;
    //     }
    //     return overAllAns;
    // }

    public boolean canJump(int[] nums) {
        // int index = 0;
        // boolean ans = solve(nums,index);
        // return ans;
        int maxReach = 0;

        for(int i =0; i<nums.length; i++){
            // case where index reach over out bound
            if(i> maxReach){
                return false;
            }
            // update the value thorugh which we can trave maximum index
            maxReach = Math.max(maxReach, i+nums[i]); // compare current maxReach wit next possible index
            if(maxReach >= nums.length-1){
                return true;
            }
        }
        return false;
    }
}