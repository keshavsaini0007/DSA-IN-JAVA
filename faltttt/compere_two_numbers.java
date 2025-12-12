import java.util.*;

public class compere_two_numbers {
       public static void main (String[ ] args){
           Scanner sc = new Scanner(System.in);
           System.out.print("enter the first number : ");
           int x = sc.nextInt();
           System.out.print("enter the second number : ");
           int y = sc.nextInt();


           if (x>y ){
               System.out.println("x is greater number ");  }

           if (y>x){
               System.out.println("y is greater number ");  }
           else {
               System.out.println("x and y are equal ");
           }


       }
}
