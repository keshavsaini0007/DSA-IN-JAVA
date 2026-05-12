import java.util.*;

public class compare_two_number
{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number ");
        double no1 = sc.nextDouble();
        System.out.println("enter the second number ");
        double no2 = sc.nextDouble();

        if (no1==no2){
            System.out.println("both number are equal ");
        } else if (no1>no2) {
            System.out.println("first number is greater");
        } else {
            System.out.println("second number is greater");
        }

        }
    }

