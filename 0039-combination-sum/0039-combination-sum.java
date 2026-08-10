class Solution {
    static void solve(int arr[] ,  int target, int index, 
        List<List<Integer>> ans,
        List<Integer> output){

            // base case 
            if(target ==0){
                // iska matlab sab soultion ready he 
                ans.add(new ArrayList(output));
                return;
            }

            // yadi index bada ho gay array ke size se 
            if(index >= arr.length){
                return;
            }
            // if target 0 se cota he 
            if(target <0){
                return ;
            }

            // recursion ke anusar ek case hum solve karege baki recursion sambhal lega
            // use include and exclude pattern 
            // indclude 
            int currentElement = arr[index];
            output.add(currentElement);
            solve(arr, target-currentElement , index, ans, output);

            // after comming back use back track 
           
            output.remove(output.size()-1);


            // exclude call
            //  element add nahi karna he to skip karna padaga
            solve(arr, target, index+1, ans, output);
        }
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        int index = 0;

    // ye ek function he solve ans batata he 
        solve(candidates, target, index, ans, output);
        return ans;
        
    }
}