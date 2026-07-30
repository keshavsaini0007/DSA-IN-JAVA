import java.util.*;
public class honoi{
    public static void chance(int n,char s,char h,char d){
       if(n==1){System.out.println(s+"->"+d);
        return; }
    chance(n-1,s,d,h);
    System.out.println(s+"->"+d);
    chance(n-1,h,s,d);
   
    }
    public static void main(String [] args){
        Scanner scan  =  new Scanner(System.in);
        System.out.println("enter no. of disks : ");
        int n  =  scan.nextInt();
    chance(n,'A','B','C');

    }
}