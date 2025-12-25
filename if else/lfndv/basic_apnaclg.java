import java.util.ArrayList;
import java.util.Collections;

public class basic_apnaclg {
    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();

        // add elements
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // get elements
        int el = list.get(1);
        System.out.println("getted element : "+el);

        //add el in b/w
        list.add(0,5);
        System.out.println(list);

        // set el
        list.set(1,4);

        // delete
        list.remove(3);
        System.out.println(list);

        // size
        int listsize = list.size();
        System.out.println("size : "+listsize);

        // loop 
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i));
        }   
        System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
