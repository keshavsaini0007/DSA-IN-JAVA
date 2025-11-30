import java.util.*;
public class sum_of_two_no {
    public static void add(int x , int y ){
        System.out.print("the sum is "+(x+y));
    }
public static void main (String [] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("enter the first number : ");
    int x = scan.nextInt();
    System.out.print("\nenter second number : ");
    int y = scan.nextInt();

    add(x,y);


}
}
