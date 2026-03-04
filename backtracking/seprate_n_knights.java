import java.util.*;

public class seprate_n_knights {
    

    
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
    public static void print(char[][] board,int nk,int m){
        if(nk == m){
        for(int i = 0 ; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.println();}
        return;
        
    }
    public static void helper(char[][] board,int row,int col,int nk,int m){
        if(col==board.length){
            print(board,nk,m);
            return;

        }


        else if(issafe(board, row, col)){
            board[row][col] = 'K';
            if(row<board.length-1){
            helper(board,row+1,col,nk+1,m);}    
            
            if(row==board.length-1) helper(board,0,col+1,nk+1,m);
            board[row][col] = '_';
        }

        if(row==board.length-1){
            board[row][col] = '_';
            helper(board,0,col+1,nk,m);
            }
        else {board[row][col] = '_';
        helper(board,row+1,col,nk,m);
        }
        
    }
public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("enter the order of chess : ");
    int n = scan.nextInt();
    System.out.print("how many no. of knights you wants to place : ");
    int m = scan.nextInt();
    char [][] board = new char[n][n];
    helper(board,0,0,0,m);

}}
