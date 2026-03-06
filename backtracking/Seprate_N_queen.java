import java.util.ArrayList;
import java.util.*;


 class  Seprate_N_queen{

    public static boolean issafe(char board [][],int row,int col){
        // horizontal 
        for(int c = 0; c<board.length; c++){
            if(board [row][c]=='Q') return false;
        }
        // vertical 
        for(int r = 0; r<board.length; r++){
            if(board [r][col]=='Q') return false;
        }
        // upper left 
        int r = row;
        for(int c = col; r>=0 && c>=0; c--, r--){
            if(board [r][c]=='Q') return false;
        }
        // upper right
         r = row;
        for(int c = col; c<board.length && r>=0; c++, r-- ){
            if(board [r][c]=='Q') return false;
        }
        // lower left
         r = row;
        for(int c = col; r<board.length && c>=0; r++, c-- ){
            if(board [r][c]=='Q') return false;
        }
        
        // lower right
         r = row;
        for(int c = col; r<board.length && c<board.length; c++, r++ ){
            if(board [r][c]=='Q') return false;
        }
        return true;
    }


    public static void set(List<List<String>> allboard,char [][] board ){
        List<String> newboard = new ArrayList<>();
        String emt = "";
        for(int i=0; i<board.length; i++){
             emt = "";
                for(int j=0; j<board.length; j++){
                    if(board[i][j]=='Q'){ emt+='Q';}
                    else emt+='.';
                }
            newboard.add(emt);
        }
        allboard.add(newboard);
    }
    public static void fixqueen(List<List<String>> allboard,char [][] board,int col){
        if(col==board.length){
            set(allboard,board );
            return;
        }
        for(int row = 0; row<board.length; row++){
            if(issafe(board ,row,col)){
                board[row][col] = 'Q';
                fixqueen(allboard,board,col++);
                board[row][col] = '.';
            }
        }
    }
    
    public   static  List<List<String>> Seprate_N_queen(int n){
        List<List<String>> allboard = new ArrayList<>();
        char [][]  board = new char[n][n];
        fixqueen(allboard,board,0);
        return allboard;
    }
    
    
}


// class Seprate_N_queen{
//    public boolean isSafe(int row, int col, char[][] board) {
//        //horizontal
//        for(int j=0; j<board.length; j++) {
//            if(board[row][j] == 'Q') {
//                return false;
//            }
//        }
      
//        //vertical
//        for(int i=0; i<board.length; i++) {
//            if(board[i][col] == 'Q') {
//                return false;
//            }
//        }
      
//        //upper left
//        int r = row;
//        for(int c=col; c>=0 && r>=0; c--, r--) {
//            if(board[r][c] == 'Q') {
//                return false;
//            }
//        }
      
//        //upper right
//        r = row;
//        for(int c=col; c<board.length && r>=0; r--, c++) {
//            if(board[r][c] == 'Q') {
//                return false;
//            }
//        }
      
//        //lower left
//        r = row;
//        for(int c=col; c>=0 && r<board.length; r++, c--) {
//            if(board[r][c] == 'Q') {
//                return false;
//            }
//        }
      
//        //lower right
//        for(int c=col; c<board.length && r<board.length; c++, r++) {
//            if(board[r][c] == 'Q') {
//                return false;
//            }
//        }
      
//        return true;
//    }
  
//    public void saveBoard(char[][] board, List<List<String>> allBoards) {
//        String row = "";
//        List<String> newBoard = new ArrayList<>();
      
//        for(int i=0; i<board.length; i++) {
//            row = "";
//            for(int j=0; j<board[0].length; j++) {
//                if(board[i][j] == 'Q')
//                    row += 'Q';
//                else
//                    row += '.';
//            }
//            newBoard.add(row);
//        }
      
//        allBoards.add(newBoard);
//    }
  
//    public void helper(char[][] board, List<List<String>> allBoards, int col) {
//        if(col == board.length) {
//            saveBoard(board, allBoards);
//            return;
//        }
      
//        for(int row=0; row<board.length; row++) {
//            if(isSafe(row, col, board)) {
//                board[row][col] = 'Q';
//                helper(board, allBoards, col+1);
//                board[row][col] = '.';
//            }
//        }
//    }
  
//    public List<List<String>> Seprate_N_queen(int n) {
//        List<List<String>> allBoards = new ArrayList<>();
//        char[][] board = new char[n][n];
      
//        helper(board, allBoards, 0);
//        return allBoards;
//    }
   
//     public static void main(String[] args) {
//         int n = 5; // Example: 4x4 chessboard
//         List<List<String>> solutions = Seprate_N_queen(n);
//         System.out.println(solutions);

       
//         }
// }
