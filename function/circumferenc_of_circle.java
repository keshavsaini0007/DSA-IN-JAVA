import java.util.*;
public class circumferenc_of_circle {
    public static double area(double r){   return 2*(3.1415926)*r;  }
    public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    double r = scan.nextDouble();
    double ar = area(r);
    System.out.println(ar);
}}
