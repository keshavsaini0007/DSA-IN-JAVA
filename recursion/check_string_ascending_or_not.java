import java.util.*;

public class check_string_ascending_or_not {
    public static void check(String str,char ch,int idx){


        if(str.charAt(idx) < ch)
        {System.out.println("string is not in increasing order");
        return;}

        if(str.charAt(idx) > ch){
            ch=str.charAt(idx); }
            
        if(idx == str.length()-1){
            System.out.println("string is in increasing order");
            return;}

        check(str,ch,idx+1);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
    System.out.println("enter the string : ");
    
        String str = scan.nextLine();
        char ch = 'a';

    check(str , ch , 0);
    

    }
}
