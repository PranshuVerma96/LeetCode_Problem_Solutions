class Solution {
    static int merge(int arr[],int s, int e, int mid){
        // first of all calcuate the length 
        int leftArrLen = mid-s+1;
        int rightArrLen = e-mid;

        // inslize the array 
        int leftArr[] = new int[leftArrLen];
        int rightArr[] = new int[rightArrLen];

        // copy the element 
        int k = s;
        for(int i=0; i<leftArrLen; i++){
            leftArr[i] = arr[k];
            k++;
        }
        k = mid+1;
        for(int i=0; i<rightArrLen; i++ ){
            rightArr[i] = arr[k];
            k++;
        }

// ⭐⭐⭐ YAHAN REVERSE PAIR COUNT KARO ⭐⭐⭐

    int i = 0;
    int j = 0;
    int crossCount = 0;

    while(i < leftArrLen && j < rightArrLen) {

        if((long)leftArr[i] > 2L * rightArr[j]) {

            crossCount += leftArrLen - i;

            j++;

        } else {

            i++;
        }
    }
        // actual logic of mergesort 
         i=0;
         j=0;
         k = s;
        while(i<leftArrLen && j<rightArrLen){
            if(leftArr[i] <= rightArr[j]){
                arr[k] = leftArr[i];
                i++;
                k++;
            }
            else{
                arr[k] =  rightArr[j];
                j++;
                k++;
            }
        }

        // after that copy all remaining element 
        while(i<leftArrLen){
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while(j<rightArrLen){
            arr[k] = rightArr[j];
            j++;
            k++;
        }

        return crossCount;
    }
    static int  mergeSort(int arr[],int s,int e){
        // base case 
        if(s>=e){
            return 0;

        }
        // calcuate mid 
        int mid = s+(e-s)/2;
        // apply merge sort of left part 
        int leftCount = mergeSort(arr,s,mid);
        // apply merge sort of right part
        int rightCount= mergeSort(arr,mid+1,e);

        // there is the merge function 
        int crossCount = merge(arr,s,e,mid);
        int totalCount = leftCount + rightCount + crossCount;
        return totalCount;
    }
    public int reversePairs(int[] nums) {
        int s = 0;
        int e = nums.length-1;
        int ans = mergeSort(nums,s,e);
        return ans;
    }
}