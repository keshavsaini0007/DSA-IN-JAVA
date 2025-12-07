import java.util.*;
public class fibb {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Up to which no. you want to print the fibb.. series : ");
        int n = scan.nextInt();

        int a = 0;
        int b = 1;
        int c;

        System.out.print(a+" ");
        System.out.print(b+" ");
        n = n-2;


        for(int i = 1; i<=n; i++){
            c=a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
             
        } } }
