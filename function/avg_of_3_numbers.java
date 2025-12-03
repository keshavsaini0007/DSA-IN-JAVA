import java.util.*;
public class avg_of_3_numbers {
    public static double avr(double x, double y , double z){
        double a = (x+y+z)/3;
        return a;
    }
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();
        double avg = avr(x,y,z);
        System.out.println(avg);

    }
}
