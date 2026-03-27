import  java.util.*;
public class diamond_star_pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
//        n=n/2;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

int x=n;
           for (int i = 1; i<=n; i++){
               if(i>1){for(int j=2; j<=i; j++){System.out.print("  ");}}
               for(int j = 1; j<=2*x-1; j++){ System.out.print("*"); }

               System.out.println(); x--;}

    }
}
