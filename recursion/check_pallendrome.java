import java.util.*;
public class check_pallendrome{
    public static void string(String str){
        int x = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                System.out.println("not"); x=1; break;
                
            }
        }
        if(x==0){System.out.println("yes");} 
        return;
    }
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        string(str);

    }
}