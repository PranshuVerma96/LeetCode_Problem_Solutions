class StockSpanner {

   
       private Deque<int[]> st;
        // int [0]  per price
        // int [1] per span

        public StockSpanner(){
            st = new ArrayDeque<>();

        }
       
    public int next(int price) {
        int span = 1;
        // monotonic pattern 
        while(!st.isEmpty() && st.peek()[0] <= price){
            span = span + st.peek()[1];
            st.pop();
        }
        // inserat to karna he he current element 
        st.push(new int[]{price, span});
        return span;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna