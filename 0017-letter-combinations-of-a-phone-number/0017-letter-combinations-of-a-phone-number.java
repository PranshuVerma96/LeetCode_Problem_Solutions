class Solution {
    // yaha per hum defnition of solve function 
    static void solve(
        String digits,
        String mapping[],
        int index,
        List<String>result,
        StringBuilder output
        
     ){
        //base case 
        if(index >= digits.length()){
            // iska matab sab subsequnce ready he 
            result.add(output.toString());
            return;
        }
        // nahi to ek case hum sovlve kare ge 
        // baki recursion sambhal lega 
        int value = digits.charAt(index)-'0';
        String mappedString = mapping[value];

        // ab current string value ready mare pass ready he 
        for(int i=0; i<mappedString.length(); i++){
            output.append(mappedString.charAt(i));

            // ab baki resursion sambhal lega 
            solve(digits, mapping,index+1,result, output);

            // ab backtracking bala step 
            output.deleteCharAt(output.length()-1);
        }

            }
    public List<String> letterCombinations(String digits) {
        String [] mapping = {"","","abc" ,"def", "ghi" ,"jkl" ,"mno" ,"pqrs" ,"tuv" ,"wxyz"};
        int index = 0;
        List<String> result = new ArrayList<>();
        StringBuilder output = new StringBuilder();

        solve(digits,mapping,index,result,output);
        return result;
    }
}