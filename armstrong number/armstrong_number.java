import java.util.*;
public class armstrong_number {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int stepnum = num;
        int temp = 0, cube = 0;
        if(num==0){System.out.println("number is armstrong");}
        while(num>0){
            temp = num%10;
            cube = cube + temp*temp*temp;
            num = num/10;
        }if(cube==stepnum){
            System.out.println(stepnum+" number is armstrong");
        } else System.out.println(stepnum+" number is not armstrong");
        
    }
}
/*some examples of armstrong:
 * 153 370 371 407 1634
 */