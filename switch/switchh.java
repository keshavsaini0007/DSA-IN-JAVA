import java.util.*;

public class switchh {
    public static void main(String[] args) {
      Scanner scan = new Scanner (System.in);

      int x = scan.nextInt();
      switch ( x ){
          case 1 : {
              System.out.println("hello");  break;
          }
          case 2 : {
              System.out.println("namaste"); break;
          }
          case 3 : {
              System.out.println("ram ram"); break;
          }
          default :
              System.out.println("invalid number");
      }

    }
}