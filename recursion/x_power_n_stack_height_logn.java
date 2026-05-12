import java.util.*;
public class x_power_n_stack_height_logn {
   public static int pow(int n , int x){
    if(x==0){return 0;}
    if(n==0){return 1;}

    if(n%2==0){return pow(n/2,x)*pow(n/2,x);}
    else{return pow(n/2,x)*pow(n/2,x)*x;}

   }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("enter the base value : ");
        int x = scan.nextInt();
        System.out.print("enter the power value : ");
        int n = scan.nextInt();
        int p = pow(n, x);
        System.out.print(p);

    }
}