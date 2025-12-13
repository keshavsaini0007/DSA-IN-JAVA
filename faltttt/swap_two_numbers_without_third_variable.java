import java.util.*;
public class swap_two_numbers_without_third_variable{
    public static void swap(int x, int y){
         x = x+y;
         y = x-y;
         x = x-y;
    System.out.print("x = "+x+" and y = "+y);
    return;
    }
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        System.out.print("enter the 1st number : ");
        int n1 = scan.nextInt();
        System.out.print("enter the 2nd number : ");
        int n2 = scan.nextInt();

        swap(n1,n2);

    }
}