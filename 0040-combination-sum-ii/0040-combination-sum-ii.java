class Solution {
    static void solve(
        int arr[],
        int target,
        int index,
        List<List<Integer>> ans,
        List<Integer> output
    ){
        // base case 
        if(target ==0){
            // iska matlab sab combo ready he 
            ans.add(new ArrayList(output));
            return;
        }
        if(index >= arr.length){
            return ;
        }
        if(target < 0){
            return;
        }
        // after that we are exclude and include pattern 
        // but ab hame dupicate element use hu karna he 
        int currentElement = arr[index];
        output.add(currentElement);
        solve(arr, target-currentElement, index+1, ans, output);

        // backtrack bala step 

        output.remove(output.size()-1);

        // but ab hame koi bu dulicate comb store nahi karna he 
        while(index+1 < arr.length && arr[index] ==  arr[index+1]){
            index++;
        }
        // exlude ki call 
        solve(arr, target, index+1, ans, output);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int index= 0;
        solve(candidates, target, index, ans, output);
        return ans;
    }
}