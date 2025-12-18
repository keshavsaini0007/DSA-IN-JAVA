
import java.util.*;

public class calculator {
    public static void main (String [] args ){
        Scanner scan = new Scanner(System.in);
        int x = 1;
        System.out.print("for additon enter 1 \n for substraction enter 2 \n");
        System.out.print("for multiplication enter 3 \n for division enter 4 \n");
        System.out.print("-----> ");
        int  a = scan.nextInt();
        if (a==1 || a==2 ||a==3 ||a==4){
        switch (a){
            case 1 :{    System.out.print("enter the first value ");
                              int a1 = scan.nextInt();
                              System.out.print("enter the next value ");
                              int a2 = scan.nextInt();
                System.out.print("\nanswer  is --> ");
                              System.out.print(a1+a2);    break; }
            case 2 : {    System.out.print("enter the first value ");
                               int a1 = scan.nextInt();
                               System.out.print("enter the next value ");
                               int a2 = scan.nextInt();
                System.out.print("\nanswer  is --> ");
                               System.out.print(a1-a2); break;}
            case 3 : {    System.out.print("enter the first value ");
                               int a1 = scan.nextInt();
                               System.out.print("enter the next value ");
                               int a2 = scan.nextInt();
                System.out.print("\nanswer  is --> ");
                               System.out.print(a1*a2);  break;}
        case 4 : {    System.out.print("enter the first value ");
                            int a1 = scan.nextInt();
                            System.out.print("enter the next value ");
                            int a2 = scan.nextInt();
            System.out.print("\nanswer  is --> ");
                            System.out.print(a1/a2);  break;}
    }} else System.out.println("invalid number");
}}
