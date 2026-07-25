class Solution {
    public int maxProduct(int n) {

    int largeDigit = -1;
    int secondLargeDigit = -1;
    while(n>0){
        int digit = n%10;
      

        if(digit > largeDigit){
            secondLargeDigit = largeDigit;
            largeDigit = digit;
        }
        else if(digit > secondLargeDigit){
            secondLargeDigit = digit;
        }
          n = n/10;
       
    }  

    return largeDigit * secondLargeDigit;

    
       

    }
}