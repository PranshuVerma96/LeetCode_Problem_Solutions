class Solution {

    // write down isValidAnswer()
    static boolean isValidAnswer(int arr[], int minSpeed , int h){
        int totalHour = 0;
        for(int i =0; i< arr.length; i++){
            if(arr[i]%minSpeed == 0){
                totalHour += arr[i] / minSpeed;
            }
            else {
                totalHour += (arr[i] / minSpeed) + 1;
  
            }
            if(totalHour > h){
                    return false;
                }
        }
        return true;
    }
    static int findMax(int arr[]){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= max){
                max = arr[i];
            }
        }
        return max;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = findMax(piles);

        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(isValidAnswer(piles,mid,h)){
                ans = mid;
                // move to minmum 
                end = mid -1;
            
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
        
    }
}