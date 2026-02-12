import java.util.*;

public class logical_operator {
   public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    // &&  ||  !
    int x = 2,y=3;

    if(x>0 && y>0){System.out.println("&&");}
//      1  &&  1  ------------> 1

    if(x>0 && y<0){System.out.println("&&");}
//      1  &&  0  ------------> 0

    if(x<0 && y>0){System.out.println("&&");}
//      0  &&  1  ------------> 0

    if(x<0 && y<0){System.out.println("&&");}
//      0  &&  0  ------------> 0


    
    if(x>0 || y<0){System.out.println("||");}
//      1  ||  0  ------------> 1

    if(x<0 || y>0){System.out.println("||");}
//      0  ||  1  ------------> 1

    if(x>0 || y>0){System.out.println("||");}
//      1  ||  1  ------------> 1

    if(x<0 || y<0){System.out.println("||");}
//      0  ||  0  ------------> 0


    if(!(x/y!=0)){System.out.println("!");}
//   it compliment 0 into 1
//   and           1 into 0

} 
}
