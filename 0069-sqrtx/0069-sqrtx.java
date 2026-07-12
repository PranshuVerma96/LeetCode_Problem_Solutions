// class Solution {
//     public int mySqrt(int x) {
        
//         if(x==0){
//             return 0;
//         }
//         else if(x==1){
//             return 1;
//         }
//         else{
//             int result = (int)Math.sqrt(x);
//               return result;
//         }
      
//     }
// }

class Solution{
    public int mySqrt(int x){
        int s = 1;
        int e = x;
        int ans = -1;

        if(x==0){
            return 0;
        }
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(mid == x/mid){
                return mid;
            }
            else if(mid > x/mid){
                // to app bade number per he 
                e = mid -1;
            }
            else{
                // mid * mid < x
                // appka soultuion to sakta he
                ans = mid;
                s = mid + 1;

            }
        }
        return ans;
    }
}