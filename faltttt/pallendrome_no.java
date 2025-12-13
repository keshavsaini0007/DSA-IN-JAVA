import java.util.*;
public class pallendrome_no {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = scan.nextInt();
        int temp = num;
        int newnum = 0;
        while(temp>0){
            
            newnum = (newnum*10)+temp%10;
            temp = temp/10;

        }

        if(num == newnum) System.out.println(num+" is pallendrome.");
          else System.out.println(num+" is not pallendrome.");

    }
}
