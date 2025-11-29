import java.util.*;
public class odd_even {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int no = sc.nextInt();
        if (no%2 == 0) {
            System.out.println("the number is even.");
        }
        else {
            System.out.println("the number is odd.");
        }
    }
}
