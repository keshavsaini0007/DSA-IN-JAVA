import java.util.*;
public class x_power_n {
  public static int power(int x, int n){
    if(n==0){return  1;}
    return x*power(x,n-1); // stack height is n+1
     // because base case is at n == 0 
      // at base case n==1 height  
  } 
    public static void main(String[]args){
      Scanner scan = new Scanner(System.in);
      System.out.print("enter the base value : ");
      int x = scan.nextInt();
      System.out.print("enter the power value : ");
      int n = scan.nextInt();
      
      int p = power(x,n);

      System.out.print("result : "+p);
}
}
