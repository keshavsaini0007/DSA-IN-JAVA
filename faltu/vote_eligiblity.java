import java.util.*;
public class vote_eligiblity {
    public static void eligiblity(double age){
        if (age>=18){  System.out.println("eligibile"); }
        if (age<18){  System.out.println("not eligibile"); }
         }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        double age = scan.nextDouble();
        eligiblity(age);
    }
}
