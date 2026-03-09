import java.util.*;

public class check_suduko {

    public static boolean issafe(char [][] board,int row,int col){
        // for row
        for(int i = 0; i<9; i++){
            if(i==row){continue;}
            if(board[i][col] == board[row][col]) return false;
        }

        // for column
        for(int i = 0; i<9; i++){
           if(i == col){continue;}
            if(board[row][i] == board[row][col]) return false;
        }
        
        // for matrix of that region
        int r = row/3*3;
        int c = col/3*3;

        for(int i = r; i<r+3; i++){
            for(int j = c; j<c+3; j++){
                if(i==row && j == col) continue;
                if(board[i][j]==board[row][col]) return false;
            }
        }
        //else 

        return true;
    }
    public static boolean helper(char[][] board){
        
        for(int i = 0 ; i<9; i++){
            for(int j = 0 ; j<9; j++){
                if(board[i][j]=='_') continue;
               if(issafe(board,i,j)==false){return false;}
            }
        }
        return true;
            
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
        
        System.out.println(helper(board));
    }
}

//              OOOOOOOOORRRRRRRRRRRRR


// import java.util.*;

// public class check_suduko {

//     public static boolean issafe(char [][] board,int row,int col, int num){
//         // for row
//         for(int i = 0; i<9; i++){
           
//             if(board[i][col] == num) return false;
//         }

//         // for column
//         for(int i = 0; i<9; i++){
           
//             if(board[row][i] == num) return false;
//         }
        
//         // for matrix of that region
//         int r = row/3*3;
//         int c = col/3*3;

//         for(int i = r; i<r+3; i++){
//             for(int j = c; j<c+3; j++){
                 
//                 if(board[i][j]==num) return false;
//             }
//         }
//         //else 

//         return true;
//     }
//     public static boolean helper(char[][] board){
        
//         for(int i = 0 ; i<9; i++){
//             for(int j = 0 ; j<9; j++){
//                 if(board[i][j]=='_') continue; 

//                 char num = board[i][j];
//                 board[i][j] = '_';
//                 if(issafe(board,i,j,num)==false) return false;
//                 board[i][j] = num;
//             }
//         }
//         return true;
            
//         }
      
       
    
    
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
//         char board [][] = {
//             {'5', '3', '_', '_', '7', '_', '_', '_', '_'},
//             {'6', '_', '_', '1', '9', '5', '_', '_', '_'},
//             {'_', '9', '8', '_', '_', '_', '_', '6', '_'},
//             {'8', '_', '_', '_', '6', '_', '_', '_', '3'},
//             {'4', '_', '_', '8', '_', '3', '_', '_', '1'},
//             {'7', '_', '_', '_', '2', '_', '_', '_', '6'},
//             {'_', '6', '_', '_', '_', '_', '2', '8', '_'},
//             {'_', '_', '_', '4', '1', '9', '_', '_', '5'},
//             {'_', '_', '_', '_', '8', '_', '_', '7', '9'}
//         };
        
//         System.out.println(helper(board));
//     }
// }
