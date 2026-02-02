import java.util.*;
public class count_maximum_no_of_1s {
    public static void main  (String[]args){
        Scanner scan = new Scanner(System.in);
    System.out.print("enter the size of rows : ");
        int r = scan.nextInt();
    System.out.print("enter the size of column : ");
        int c = scan.nextInt();
        int marks[][] = new int[r][c];
    
       for(int i = 0; i<r; i++){
        for(int j = 0; j<c; j++){
        marks[i][j] = scan.nextInt();
        } 
       }
       int v = 0;
       for(int i = 0; i<r; i++){
        for(int j = 0; j<c; j++){
            if (marks[i][j] == 1) {v++;}
            
            } 
       }
       System.out.print("no. of 1s in matrix are : "+v);
    }
}
