import java.util.HashSet;
import java.util.Iterator;

public class HASHSET {
    public static void main(String args[]){
        HashSet<Integer> hashSet = new HashSet<>();

        // add or insert
        
        
        hashSet.add(4);
    
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(2);
        // size

        System.out.println("size is " + hashSet.size());

        
        
        // print
        System.out.println(hashSet);


        // iterator
        Iterator it = hashSet.iterator();

        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();


        // contains
        if(hashSet.contains(2)){
            System.out.println("it contains 2");
        }

        if(!hashSet.contains(6)){
            System.out.println("it not contains 6");
        }

        // delete and remove

        hashSet.remove(3);

        if(!hashSet.contains(3)){
            System.out.println("we have deleted 3");
        }


        

    
    }
}
