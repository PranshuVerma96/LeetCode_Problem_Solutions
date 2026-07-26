class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length()-1;

        while(i>=0){
            // remove all the tralling space 
            while(i>=0 && s.charAt(i) ==' '){
                i--;
            }
            // check value of i 
            if(i<0){
                break;
            }
            int j = i;
            // find the start index of the word
            while(j>=0 && s.charAt(j) != ' '){
                j--;
            }
            // ab jise he j space wale index per ayage fa to ruk jaega 
            // ab is word ane ans me append karo
            ans.append(s.substring(j+1,i+1));

            // remmove extra space
          while (j>=0 && s.charAt(j) == ' '){
              j--;
          }

            // remove extra space 
            if(j >=0){
                // space needed
                ans.append(' ');
            }
            i =j;
        }
        return ans.toString();
        
    }
}