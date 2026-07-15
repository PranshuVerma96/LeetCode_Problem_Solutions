class Solution {
    // inilitize the isValidAnswer function 

    static boolean isValidAnswer(int arr[], int k , int maxDistance){
        int boolCount = 1;
        int lastForce = 0;

        for(int i=1; i<arr.length; i++){
            if(arr[i] - arr[lastForce] >= maxDistance){
                boolCount ++;
                lastForce = i;

                if(boolCount == k){
                    return true;
                }
            }
        
        }
        // otherwise return false
        return false;
    }
    public int maxDistance(int[] position, int m) {
        
        Arrays.sort(position);
        int n = position.length;
        // first of all inilize all variable 
        int start = 0; // miniMum Force
        int end = position[n-1] - position[0]; // maxMum Force
        int ans = -1;
        while(start <= end){
            int mid = start + (end -start)/2;

            if(isValidAnswer(position,m,mid)){
             ans = mid;
             // move to right 
             start = mid + 1;
            }
            else{
                // check in left side
                end = mid -1;
            }
        }

        return ans;

    }
}