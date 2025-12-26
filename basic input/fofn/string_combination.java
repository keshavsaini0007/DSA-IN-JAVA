import java.util.*;
public class string_combination {
    public static void comb(String str , int idx , String combination){
    if(str.length() == 0){
        System.out.println(combination);
    }
    for(int i = 0; i<str.length(); i++){
        char ch = str.charAt(i);
        String newstr = str.substring(0,i) + str.substring(i+1);
        comb(newstr,idx+1,combination+ch);
    }   
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        comb(str, 0, "");
    }
 
}
