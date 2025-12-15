
import java.util.*;

public class String_permutation { 

     public static void printper(String str,int idx,String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            String newstr = str.substring(0,i)+str.substring(i+1);
            printper(newstr, idx+1, permutation+ch);
        }
    }
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
       String str = scan.nextLine();
       printper(str,0,"");
}}
