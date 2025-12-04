import java.util.*;
public class greater_of_two_number {
    public static double greater(double x , double y ){
        if (x>y){return x;}
        else return y;
    }
    public static void main(String[] args){
        Scanner scan  = new Scanner(System.in);
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double gr = greater(x,y);
        System.out.println(gr);
    }
}
