class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;

        int row = 0;
        int col = totalCol -1;
        // hum is me left and bottom approach follow kare ge if targe bada ho ga to bottom nahi to eft

        while(row < totalRow && col >=0){
            if(matrix[row][col]==target){
                return true;
            }
            else if(matrix[row][col] > target){
                // isaka matlb he ki  move to left 
                col --;
            
            }else{
                // move to down
                row++;
            }
        }
        // yadi element nahi he to 
        return false;
    }
}