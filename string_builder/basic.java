import java.util.*;
public class basic{
    // string are immutable
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the string : ");
        String str = scan.nextLine();
        // declaration..
        StringBuilder sb = new StringBuilder(str);
       
        System.out.println(sb);
        
    }
}