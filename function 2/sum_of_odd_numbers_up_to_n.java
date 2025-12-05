import java.util.*;
public class sum_of_odd_numbers_up_to_n {
    public static int oddsum(int n){
        int x = 0;
        for(int i = 1; i<=n; i=i+2){// 1+3+5+7+9+11...n
            x = i + x; }
    return x;}
public static void main(String [] args){
    Scanner scan = new Scanner (System.in);
    int n = scan.nextInt();
    int sum = oddsum(n);
    System.out.print(sum);
}
}
