  import java.util.*;
public class fill_sudoku {
    
  public static boolean issafe(char [][] board,int row,int col,char ch){
    // for row
    for(int i = 0; i<9; i++){
        if(i==row){continue;}
        if(board[i][col] == ch) return false;
    }

    // for column
    for(int i = 0; i<9; i++){
       if(i == col){continue;}
        if(board[row][i] == ch) return false;
    }
    
    // for matrix of that region
    int r = row/3*3;
    int c = col/3*3;

    for(int i = r; i<r+3; i++){
        for(int j = c; j<c+3; j++){
            if(i==row && j == col) continue;
            if(board[i][j]==ch) return false;
        }
    }
    //else 

    return true;
}
public static void print(char[][] board){
  for(int i = 0; i<board.length; i++){
    for(int j = 0; j<board.length; j++){
      System.out.print(board[i][j]+" ");
    }
  System.out.println();
}
}

public static void fill(char[][] board,int row,int col){

  if(row==board.length) {
   print(board);

  return;}

  if(board[row][col]!='_'){
    if(col<board.length-1)  fill(board, row, col+1);
    else fill(board, row+1, 0);
  }
  if(board[row][col]=='_') {
    for(char ch = '1'; ch<='9'; ch++){
      
      if(issafe(board, row, col,ch)){
        board[row][col] = ch;
        if(col<board.length-1) fill(board, row, col+1);
        else fill(board, row+1, 0);
        board[row][col] = '_'; // backtracking 
      }
    }
  }


}

public static void main(String args[]){
  Scanner scan = new Scanner(System.in);
  char board [][] = {
      {'5', '3', '_', '_', '7', '_', '_', '_', '_'},
      {'6', '_', '_', '1', '9', '5', '_', '_', '_'},
      {'_', '9', '8', '_', '_', '_', '_', '6', '_'},
      {'8', '_', '_', '_', '6', '_', '_', '_', '3'},
      {'4', '_', '_', '8', '_', '3', '_', '_', '1'},
      {'7', '_', '_', '_', '2', '_', '_', '_', '6'},
      {'_', '6', '_', '_', '_', '_', '2', '8', '_'},
      {'_', '_', '_', '4', '1', '9', '_', '_', '5'},
      {'_', '_', '_', '_', '8', '_', '_', '7', '9'}
  };
  fill(board,0,0);
}
}
