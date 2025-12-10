import java.util.*;
public class x_to_the_power_n {

    public static int  power(int x,int n,int m) {
        n--;      m = x*m;
    if(n>1) {  return power(x, n, m);   }
    else  {  return m; }
    }

        public static void main (String []args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the base value  : ");
        int x = scan.nextInt();
        System.out.print("enter the power value  : ");
        int n = scan.nextInt();
        int m = x;
        int p = power(x,n,m);
        System.out.println("the result is : "+(p));
    }
}
