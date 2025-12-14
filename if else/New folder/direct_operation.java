import java.util.*;

public class direct_operation {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("is"); // by default it adds element at last 
        list.addFirst("this");
        list.addLast("a");
        list.addLast("list");

        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.addFirst("this");
        System.out.println(list);

        list.removeLast();
        System.out.println(list);

        list.addLast("list");
        System.out.println(list);

        list.remove(2); // by index value
        System.out.println(list);

        list.add(2,"a");
        System.out.println(list);

        System.out.println("size of list : " + list.size());

        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.print("null");
        
    }
}