import java.util.*;
public class factorial {
    public static int factorial(int x, int a){
        x = x*(a);   a--;
        if(a>1){return factorial(x,a);}
        return x ; }

    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a number : ");
        int x = scan.nextInt();
        if (x<0){ System.out.print("please enter a positive number ");
        }
        int a=x-1;
        int b = 1;
        if(x>0){
       int fact =  factorial(x,a);
       System.out.print("\n"+fact);}
    }
}
