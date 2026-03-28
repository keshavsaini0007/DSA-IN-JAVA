import java.util.*;
public class SpiralMatrix{
    public static void spiral(int rows,int columns){
        int top = 0, down = rows-1;
        int left = 0, right = columns-1;
        int tne = 0; 
        int en = 1;
        int arr[][] = new int[rows][columns];
        while(rows*columns>tne){

        for(int i = left; i<=right; i++ ){ tne++;
            arr[top][i] = en;
            en++;
        }
        top++;
        for(int i = top; i<=down; i++ ){ tne++;
            arr[i][right] = en;
            en++;
        }
        right--;
        for(int i = right ; i>=left; i-- ){ tne++;
            arr[down][i] = en;
            en++;
        }
        down--;
        for(int i = down ; i>=top; i-- ){ tne++;
            arr[i][left] = en;
            en++;
        }
        left++;
        }

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++){
                System.out.printf("%3d", arr[i][j]);
            }
            System.out.println();
        }
        return;

    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number of rows : ");
        int rows = scan.nextInt();
        System.out.print("enter the number of columns : ");
        int columns = scan.nextInt();
        scan.close();

        spiral(rows,columns);
    }
}

