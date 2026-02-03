import java.util.*;
public class transpose_of_matrix {
    

    public static void main (String[]args){
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
       for(int i = 0; i<r; i++){
        for(int j = 0; j<c; j++){
            System.out.print(marks[j][i]+" ");
            
            } System.out.print("\n");
       }
    }
}
/*
      c1 c2 c3 c4
r1    58 38 46 26    58 37 84 29 58 
r2    37 33 23 47    38 33 74 83 37 
r3    84 74 32 43    46 23 32 73 46 
r4    29 83 73 62    26 47 43 62 26
r5    58 37 46 26   






*/