import java.util.*;
public class reverse {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder(str);

        for(int i = 0 ; i<=(str.length()-1)/2; i++ ){
        char front = sb.charAt(i);
        char back = sb.charAt(str.length()-1-i);
        
        sb.setCharAt(i,back);
        sb.setCharAt(sb.length()-1-i,front);
        
        }

        System.out.println(sb);
    }
}