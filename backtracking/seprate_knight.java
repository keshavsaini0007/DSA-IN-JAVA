
import java.util.*;

public class seprate_knight {

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
    public static void set(List<List<String>> allboards, char board[][]) {

    //  for printing list 


        // List<String> newboard = new ArrayList<>();
        // String str = "";
        // for (int i = 0; i < board.length; i++) {
        //     str = "";
        //     for (int j = 0; j < board.length; j++) {
        //         if (board[i][j] == 'K') {
        //             str += 'K';  // Append knight
        //         } else {
        //             str += '.';  // Append empty cell
        //         }
        //     }
        //     newboard.add(str);  // Add this row to the board
        // }
        // allboards.add(newboard);  // Add the full board to results


    // for printing chess or matrix
        
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        return;
    }

    // Recursive backtracking helper to try placing knights
    public static void helper(List<List<String>> allboards, char board[][], int row, int col) {
     if(col==board.length){
        set(allboards,board);
        return;
     }
        if(issafe(board,row,col)){
            board[row][col]='K';
            if(row!=board.length-1) helper(allboards,board,row+1,col);
            else helper(allboards,board,0,col+1);
            board[row][col] = '.';
        }
         if(row!=board.length-1) {
            board[row][col]='.';
            helper(allboards,board,row+1,col);}
        else  
        {
            board[row][col]='.';
            helper(allboards,board,0,col+1);}

    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = 3; // Size of the board (n x n) 
        // int K = 3; // Number of knights to place
        // You can also take input from user: int n = scan.nextInt();

        List<List<String>> arrange = new ArrayList<>();
        char arr[][] = new char[n][n];
    
        helper(arrange,arr,0,0);
        System.out.println(arrange);
     }
}
