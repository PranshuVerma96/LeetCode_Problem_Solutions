class Solution {
    // definition of solve function 
    static void solve(
        int nums[] ,
        boolean visited[],
        List<List<Integer>> ans,
        List<Integer> output
    ){
        // base case 
        // ager array ki length 0 he or remain list me koi element nahi he to 
        // permutaion reay he 
     if(output.size() == nums.length){
        ans.add(new ArrayList(output));
        return;
     }
    
        // nahi her element per iterate karo 
        for(int i=0; i<nums.length; i++){
            // agar element already use ho chuka hei 
      if(visited[i]){
        continue;
      }
      // chose 
      visited[i] = true;
      output.add(nums[i]);

      // recursion step 
      solve(nums, visited, ans, output);
      output.remove(output.size()-1);
      visited[i] = false;
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        boolean visited [] = new boolean[nums.length];
        int index = 0;
        solve(nums,visited,ans, output);
        return ans;
        
    }
}