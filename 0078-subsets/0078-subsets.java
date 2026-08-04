class Solution {
    static void solve(int[]nums, int index, List<Integer>output,List<List<Integer>> ans){
        // base case 
        if(index == nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }

        // Include 
        output.add(nums[index]);
         solve(nums, index + 1, output, ans);
        // backTrack
        output.remove(output.size() -1);

        // exclude
         solve(nums, index + 1, output, ans);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>output = new ArrayList<>();
        int index =0; 
        solve(nums, index, output , ans);
        return ans;
        
    }
}