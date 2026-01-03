import java.util.*;
public class basic {
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
            } System.out.print("\n");
       }
       for(int i = 0; i<marks.length; i++){
        for(int j = 0; j<marks[i].length; j++){
            System.out.print(marks[i][j]+" ");
            } System.out.print("\n");
       }
    }
}
