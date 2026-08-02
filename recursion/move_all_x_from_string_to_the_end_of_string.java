import java.util.*;

public class move_all_x_from_string_to_the_end_of_string {
// newstr = ""
// XX = 0
    public static int  move(String str,int idx,String newstr,int XX){
        if(idx == str.length()-1){
            System.out.print(newstr);
            for(int i = 0; i<=XX; i++){
                System.out.print("x");
            }return 0;}
        if(str.charAt(idx)!='x'){newstr = newstr+str.charAt(idx);
        return move(str,idx+1,newstr,XX);}
        else  XX++; return move(str,idx+1,newstr,XX);
    }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
       
        int xx = move( str,0, "", 0);
        
    }
}
