class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;

        int start = 0;
        // total element 
        int n = totalRow * totalCol;

        int end = n-1;

        while(start<=end){
            int mid = start + (end - start)/2;
            int rowIndex = mid/totalCol;
            int colIndex = mid % totalCol;

            if(matrix[rowIndex][colIndex] == target){
                return true;
            }
            else if(matrix[rowIndex][colIndex] > target){
                // if target se bada he to left mt jao
                end = mid -1;
            }
            else{
                start = mid +1;

            }
        }
        // agar yaha tak a gaye ho to kush nahi mile gala 
        return false;
    }
}