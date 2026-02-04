import java.util.*;
public class set{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the string : ");
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(1,'k');  
        // it replace the 1 indexed value by k.
        System.out.println(sb);
        
    }
}