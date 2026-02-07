import java.util.*;
public class insert_ {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder(str);
        sb.insert(0, 'k');
        System.out.println(sb);
        
    }
}
