import java.util.*;

public class age {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter the value of age :");
        int age = sc.nextInt();
        if (age < 18){
            System.out.println("teen");
        }
        else System.out.println("adult");
        //System.out.println(age);
    }

}