class Solution {
    public String removeOccurrences(String s, String part) {
        
        // loop baha tak chalo jab tak ki string me part string abaiable he 
        while(s.contains(part)){
            // first of all calculate the index where the part is started 
            int index = s.indexOf(part);
            // after that add the string 
            s = s.substring(0,index)+ s.substring(index + part.length());
        }
        return s;
    }
}