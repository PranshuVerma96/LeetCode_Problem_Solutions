class Solution {
    static void solve(
        int arr[],
        int target,
        int count,
        int index, 
        int k , 
        List<List<Integer>> ans,
        List<Integer> output
    ){
        // base case 
        if(count == k && target ==0){
            // iska matlab compo ready he 
            ans.add(new ArrayList(output));
            return;
        } 
        if(index >= arr.length){
            return ;
        }
        if(target <0){
            return;
        }
        // ab hum include exclude pattern follw karege 
        int currentElement = arr[index];
        output.add(currentElement);
        // include bali call karo
        solve(arr, target-currentElement, count+1, index+1, k, ans, output);

        // ab back track bali call maro 
        output.remove(output.size()-1);

        // ab exclude balid call maro 
        solve(arr, target, count,index+1, k, ans, output);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target  = n;
        int count =0;
        int index = 0;
        solve(arr, target, count, index, k , ans, output);
        return ans;
    
    
    }
}