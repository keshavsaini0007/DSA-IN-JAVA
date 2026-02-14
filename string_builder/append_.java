import java.util.*;
public class append_ {
   public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    StringBuilder sb = new StringBuilder(str);
    // .append means ---> adding something after the string..
    // supports only string....
    sb.append("hmm");  // str = str + "hmm"
    System.out.print(sb);
   } 
 }
