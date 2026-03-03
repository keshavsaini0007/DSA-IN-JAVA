
import java.util.*;

public class max_knights_in_board_ {
    static int maxknight = -1;

    // Function to check whether it's safe to place a knight at board[row][col]
    public static boolean issafe(char[][] board, int row, int col) {
        int i, j;

        // Each condition checks whether there's an existing knight ('k') in a position
        // from which it can attack the current position [row][col]
        
        // 2 down 1 right
        i = row + 2;
        j = col + 1;
        if (i < board.length && j < board.length && board[i][j] == 'K')
            return false;

        // 2 down 1 left
        i = row + 2;
        j = col - 1;
        if (i < board.length && j >= 0 && board[i][j] == 'K')
            return false;

        // 2 up 1 right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < board.length && board[i][j] == 'K')
            return false;

        // 2 up 1 left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && board[i][j] == 'K')
            return false;

        // 1 up 2 left
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && board[i][j] == 'K')
            return false;

        // 1 down 2 left
        i = row + 1;
        j = col - 2;
        if (i < board.length && j >= 0 && board[i][j] == 'K')
            return false;

        // 1 down 2 right 
        i = row + 1;
        j = col + 2;
        if (i < board.length && j < board.length && board[i][j] == 'K')
            return false;

        // 1 up 2 right
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < board.length && board[i][j] == 'K')
            return false;

        // If no attacking knight is found, return true
        return true;
    }

    // Helper function to convert current board state into string format and store it
    public static void set(char board[][],int num) {
         
        maxknight = Math.max(maxknight,num);
    
        return;
    }

    // Recursive backtracking helper to try placing knights
    public static void helper(char board[][], int row, int col,int num) {
     if(col==board.length){
        set(board,num);
        return;
     }
        if(issafe(board,row,col)){
            board[row][col]='K';
            if(row!=board.length-1) helper(board,row+1,col,num+1);
            else helper(board,0,col+1,num+1);
            board[row][col] = '.';
        }
         if(row!=board.length-1) {
            board[row][col]='.';
            helper(board,row+1,col,num);}
        else  
        {
            board[row][col]='.';
            helper(board,0,col+1,num);}

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
       char arr[][] = new char[n][n];
    
        helper(arr,0,0,0);
        System.out.println(maxknight);
     }
}
