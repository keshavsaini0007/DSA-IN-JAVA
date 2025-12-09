import java.util.*;
public class print_number_from_n_to_m_also_count_step {
    public static void pr(int s , int e, int y){
        while(e>=s){ System.out.print(s+" "); s++;
            y++;
            if(s>e){
                System.out.print("\nnumber of steps "+y);
            break;}}
    }
   public static void main(String[]args){
       Scanner scan = new Scanner(System.in);
       System.out.print("enter starting number : ");
       int s = scan.nextInt();
       System.out.print("\nenter ending number : ");
       int e = scan.nextInt();
       int y = 0;
       pr(s,e,y);

   }
}
