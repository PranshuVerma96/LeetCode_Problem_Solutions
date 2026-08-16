class Solution {
    static boolean isSafeToPlace(
        char[][]board,
        char charValue,
        int rowIndex,
        int colIndex
    ){
        // rules 
        // check for horizontal or same row
        // rowIndex sab cel k lye same rahega 
        // and col ka index 0 se 9 tak move karea
        for(int col =0; col<9; col++){
            if(board[rowIndex][col]== charValue){
                return false;
            }
        }
        // check for vertica or same colum 
        // colIndex sab cell ke liye same rahega
        // row Ka index 0 to 9 move kare ga
        for(int row=0; row<9; row++){
            if(board[row][colIndex] == charValue){
                return false;
            }
            
        }
        // check for current 3*3 wal sub box
        int startRow = rowIndex - rowIndex%3;
        int startCol = colIndex - colIndex%3;

        // travel over the 3*3 wala box
        for(int i=0; i<3;i++){
            for(int j=0; j<3; j++){
                int actualRow = startRow + i;
                int actualCol = startCol + j;
                if(board[actualRow][actualCol] == charValue){
                    return false;
                }
            }
        }
        // ager isa nahi he to return
        return true;
    }
    static boolean findEmptyCell(char[][] board,int emptyCell[]){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '.'){
                    // stoe empty cell ki row
                    emptyCell[0] = i;
                    // store empty cell ki col ka index
                    emptyCell[1] = j;
                    // mil gay to return karo 
                    return true;
                }
            }
        }
        // kahi per bi empty cell nahi mia 
        return false;
    }
    // defnition fo solve sudokuHelper function 
    static boolean solveSudokuHelper(char[][] board){
        // base case 
        // when there is not any empty spaces in side the board
        // then problem is solved
        int emptyCell[] = new int[2];
        if(!findEmptyCell(board,emptyCell)){
            return true;
        }
        // if lets say I found the empty cell
        int rowIndex = emptyCell[0];
        int colIndex = emptyCell[1];
    
        for(int value =1; value<=9; value++){
        char charValue = (char)(value + '0');
        if(isSafeToPlace(board,charValue,rowIndex, colIndex)){
            // place kar do 
            board[rowIndex][colIndex] = charValue;

            // baki recursion ko de do 
            
        if(solveSudokuHelper(board) == true){
            return true;
        }
    
        // ager recursion nahi kar pya or wapas a gaua 
        // current value ko udo karo 
        // backtracking bala step 
        board[rowIndex][colIndex] = '.';
        }
    }

// not abole to solve the problem 
    return false;
    }

    public void solveSudoku(char[][] board) {
        solveSudokuHelper(board);
    }
}
