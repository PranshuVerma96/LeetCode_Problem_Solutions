class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int []  ans = new int[n];
        Deque<Integer> st = new ArrayDeque<>();

        for(int i =0; i<n; i++){
            // for each index, we will find ans using stack 
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                // in found warmer day 
                int prevDay = st.pop();

                ans[prevDay] = i - prevDay;
            }

            // after all the proping mughe current temp tk insert karna he 
            st.push(i);

        }

    return ans;

        // int n = temperatures.length;
        // int[] ans = new int[n];

        // for(int i =0; i<n; i++){
        //     // we want to find the anser 
        //     // for each index i move in the right direction and search for a warmer days and take difference of indexes
        //     // to get the numbers of day and we can sotre in ans array

        //     for (int j =i+1; j<n; j++){
        //         if(temperatures[j] > temperatures[i]){
        //             // warmer day 
        //             int days = j-i;
        //             ans[i] = days;
        //             break;
        //         }
        //     }
        // }
        // return ans;
        
    }
}