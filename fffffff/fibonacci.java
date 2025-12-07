import java.util.*;
public class fibonacci{
    public static void main (String [] args ){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // a  b    (a+b)
        // 0  1      1     2     3    5    8                              // symmetry
        //    a      b   (a+b)

        int c, a = 0, b = 1; 
        System.out.print((a)+" ");
        System.out.print((b)+" ");
        n-=2;
        for (int i = 1; i<=n; i++){
            c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            
        }
    }
}












//import java.util.*;
//public class fibonacci {
//    public static void main (String [] args){
//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int a = 0 , b = 1;
//        System.out.print(a+" ");
//        for(int i = 2; i<=n; i++){
//            System.out.print(b+ " ");
//            int temp = b;
//            b = b+a;
//            a = temp;
//
//        }
//    }
//}