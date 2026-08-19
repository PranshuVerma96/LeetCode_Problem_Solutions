class Solution {
    static void merge(
        int arr[],
        int start,
        int end,
        int mid
    ){
        // first of all calcuate 
        int leftArrayLen = mid - start+1;
        int rightArrayLen = end - mid;

        int leftArray[] =  new int[leftArrayLen];
        int rightArray[] =  new int[rightArrayLen];

        // firt copy left element
        int k = start;
        for(int i=0; i<leftArrayLen; i++){
            leftArray[i] = arr[k];
            k++;
        }
        // second copy right array
        k = mid+1;
        for(int i =0; i<rightArrayLen;i++){
            rightArray[i] = arr[k];
            k++;
        }

        // ab sort karo dono part ko 
        int i=0;
        int j =0; 
        k = start;
        while(i <leftArrayLen && j < rightArrayLen){
            if(leftArray[i] < rightArray[j]){
                arr[k] = leftArray[i];
                i++;
                k++;
            }
            else{
                arr[k] = rightArray[j];
                j++;
                k++;
            }
        }
       // paste remain right element 
        while (j< rightArrayLen){
            arr[k] = rightArray[j];
            j++;
            k++;
        }

        // pasete remain left element
        while(i < leftArrayLen){
            arr[k] = leftArray[i];
            i++;
            k++;
        }

    }
    static void mergeSort(
        int arr[],int start,int end
    ){
        // base case 
        if(start >= end){
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(arr,start,mid);

        // sort right part
        mergeSort(arr,mid+1,end);

        // after we need to call merge function 
        merge(arr,start,end,mid);
    }
    public int[] sortArray(int[] nums) {
         mergeSort(nums, 0, nums.length - 1);

        return nums;
    }
}