import java.util.*;
public class string_combination{
    public static void print(String str,int idx,String combination){
        if(str.length()==0){
        // if(str.length()==idx){        // if repeatiotion is possible 
            System.out.println(combination);
            return ;
        }
    for(int i = 0; i<str.length(); i++){
        char currchar = str.charAt(i);
        String newstr = str.substring(0,i) + str.substring(i+1); // backtracking
        print(newstr,idx+1,combination+currchar);
        // print(str, idx+1, combination+currchar);
    }
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter your string : ");
        String str = scan.nextLine();
        print(str,0,"");
    }
}
