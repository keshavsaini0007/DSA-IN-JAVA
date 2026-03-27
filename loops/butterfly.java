import java.util.*;
public class butterfly {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in );
        int n = scan.nextInt();
        int x = n;
        for (int i = 1 ; i <= n; i++){
            for(int j = 1 ; j<=i ; j++){   System.out.print("*"); }
            for (int j = x-1; j>=1; j--){   System.out.print("  "); }
            for (int j = x-1; j>=1; j--){   System.out.print("  "); }
            for(int j = 1 ; j<=i ; j++){   System.out.print("*"); }
            x--;

            System.out.print("\n");
        }
        int y = n;
       for (int i = 1 ; i<=n ; i++) {
           for (int j = n; j >= i; j--) { System.out.print("*");}
if (i>1){for (int j = 2; j <= i; j++) { System.out.print("  ");}
             for (int j = 2; j <= i; j++) { System.out.print("  ");}}
           for (int j = n; j >= i; j--) { System.out.print("*");}
           y--;
        System.out.println();
    }
    }
}
