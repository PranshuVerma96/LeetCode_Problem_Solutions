class Solution {
    // there is isSfeToPace function 
    static boolean isSafeToPlace(
        int rowIndex,
        int colIndex,
        int n, 
        char[][] board
    ){
        // there are three obserbation 
        //1 . check eft horizontal
        int row = rowIndex;
        int col = colIndex;

        while(col >=0){
            if(board[row][col] == 'Q'){
                return false;
                // row index me koi change mat karo 
                // col ki value 0 tak travel karege
            }
            col--;
        }
        // check left uper diagnol
        row = rowIndex;
        col = colIndex;
        while(row>=0 && col>= 0){
            if(board[row][col] == 'Q'){
                return false;
            }
            row--;
            col--;
        }

        // check left lower diagnol
        row = rowIndex;
        col = colIndex;

        while(row <n && col>=0){
            if(board[row][col] == 'Q'){
                return false;
            }
            row++;
            col--;
        }

        // nahi to return true karo sab kush sahi he 
        return true;
    }
    // defination for solve function 
    static void solve(
        char board[][],
        int n,
        int colIndex,
        List<List<String>> ans
    ){
        // sabse phle hum base case try karege 
        // base case 
        if(colIndex >=n){
            // out of bound 
            // iska matlab board sare arrngement fill he 
            // valid ans mill gaya he 
            // ise store kor or retur karo 
            List<String> temp = new ArrayList<>();
            
            for(int i=0; i<n; i++){
                temp.add(new String(board[i]));
            }
            // use apni answer list me add karege 
            ans.add(temp);
            return;
        }
        // ab ek case hum solve karege 
        // baki recursion sambal lega 

        for(int rowIndex =0; rowIndex <n; rowIndex++){
            if(isSafeToPlace(rowIndex,colIndex,n,board)){
                // place queen 
                board[rowIndex][colIndex] = 'Q';

                // baki ka recursion samba lega 
                solve(board,n,colIndex+1,ans);

                // ye step sabse importand he 
                // backtracking bala step
                board[rowIndex][colIndex] = '.';
            }
        }

    }
    public List<List<String>> solveNQueens(int n) {
        char [][] board = new char[n][n];
        
        // ye loop array ke sare pace fill karega 
        for(int i=0; i<n; i++){
            Arrays.fill(board[i],'.');
        }
        // hum ise column approach leke solve kar rahe he 
        int colIndex = 0;
        List<List<String>> ans = new ArrayList<>();
        solve(board,n,colIndex,ans);
        return ans;
        
    }
}