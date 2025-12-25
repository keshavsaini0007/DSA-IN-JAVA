import java.util.ArrayList;
import java.util.*;

public class basic {
    public static void main(String args[]){
        List<Integer> list = new  ArrayList<Integer>();

        //add elements 
        list.add(6);
        list.add(3);
        list.add(9);
        list.add(7);

        System.out.println(list);

        // get elements
        int g1 = list.get(0);
        System.out.println(g1);

        // set element
        list.add(0,12);

        System.out.println(list);
        
        // remove elements 
        list.remove(1);
        System.out.println(list);

        
        // size of array
        int size = list.size();
        System.out.println(size);



    }
}
