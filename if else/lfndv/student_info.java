import java.util.*;

class Student {
    String name ;
    String college;
    String rollnumber;


    public void studentinfo(){
        System.out.println(this.name);
        System.out.println(this.college);
        System.out.println(this.rollnumber);
    }

}


public class student_info {
    public static void main(String args[]){

        Student s1 = new Student();
        Student s2 = new Student();
        

        Scanner scan = new Scanner(System.in);


        System.out.print("\nenter the name of student s1 : ");
        s1.name = scan.nextLine();
        System.out.print("\nenter the college of student s1 : ");
        s1.college = scan.nextLine();
        System.out.print("\nenter the rollnumber of student s1 : ");
        s1.rollnumber = scan.nextLine();

        System.out.print("\nenter the name of student s2 : ");
        s2.name = scan.nextLine();
        System.out.print("\nenter the college of student s2 : ");
        s2.college = scan.nextLine();
        System.out.print("\nenter the rollnumber of student s2 : ");
        s2.rollnumber = scan.nextLine();


        System.out.print("\n\nthe name of student s1 : "+s1.name);
        
        System.out.print("\nthe college of student s1 : "+s1.college);
        
        System.out.print("\nthe rollnumber of student s1 : "+s1.rollnumber);
        

        System.out.print("\nthe name of student s2 : "+s2.name);
        
        System.out.print("\nthe college of student s2 : "+s2.college);
        
        System.out.print("\the rollnumber of student s2 : "+s2.rollnumber);

    }
}
