import java.util.*;

public class name {
    public static void myname(String name){ // function declare
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next() ;
        myname(name); // function call

    }
}