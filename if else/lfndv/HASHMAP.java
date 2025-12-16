import java.util.*;
public class HASHMAP {
    public static void main(String args[]){
    HashMap<String,Integer> hashmap = new HashMap<>();

    // Insertion

    hashmap.put("INDIA",120);
    hashmap.put("US",30);
    hashmap.put("CHINA",150);

    System.out.println(hashmap);

    // updation
    hashmap.put("CHINA", 180);
    System.out.println(hashmap);

    // remove
    hashmap.remove("CHINA");
    System.out.println("After deletion :- "+hashmap);

    // add again
    hashmap.put("CHINA",180);
    System.out.println("After adding CHINA :- "+hashmap);

    // search
    if(hashmap.containsKey("CHINA")){
        System.out.println("it contains CHINA key...");
    }
    else {
        System.out.println("it not contains CHINA key...");
    }

    if(!hashmap.containsKey("INDONASIA")){
        System.out.println("it not contains INDONASIA...");
    }

    // access
    System.out.println("india's population is -> "+hashmap.get("INDIA")+" crore");          // key  exists
    System.out.println("indonasia's population is -> "+hashmap.get("INDONASIA")+" crore");  // key doesn't exists


    // iterate both keys and values
    for( Map.Entry<String,Integer> e : hashmap.entrySet()){
        System.out.print(e.getKey()+"->");
        System.out.println(e.getValue());
    }

    // iterate keys only


    for(String key : hashmap.keySet()){
        System.out.println(key);
    }


    }
}


// import java.util.*;

// public class HASHMAP {
//     public static void main(String args[]) {
//         // Create a new HashMap to store country names as keys and their populations as values
//         HashMap<String, Integer> hashmap = new HashMap<>();

//         // -------- Insertion --------
//         hashmap.put("INDIA", 120);    // Add INDIA with population 120
//         hashmap.put("US", 30);        // Add US with population 30
//         hashmap.put("CHINA", 150);    // Add CHINA with population 150

//         // Print current contents of the HashMap
//         System.out.println(hashmap);

//         // -------- Updation --------
//         hashmap.put("CHINA", 180);    // Update CHINA's population to 180
//         System.out.println(hashmap);  // Print updated map

//         // -------- Deletion --------
//         hashmap.remove("CHINA");      // Remove CHINA from the map
//         System.out.println("After deletion :- " + hashmap);  // Print map after deletion

//         // -------- Add Again --------
//         hashmap.put("CHINA", 180);    // Add CHINA again with population 180
//         System.out.println("After adding CHINA :- " + hashmap);

//         // -------- Search / Contains Check --------
//         if (hashmap.containsKey("CHINA")) {
//             System.out.println("It contains CHINA key...");
//         } else {
//             System.out.println("It does not contain CHINA key...");
//         }

//         if (!hashmap.containsKey("INDONASIA")) {
//             System.out.println("It does not contain INDONASIA...");
//         }

//         // -------- Access --------
//         // Use get() to access value by key
//         System.out.println("India's population is -> " + hashmap.get("INDIA") + " crore");       // Key exists
//         System.out.println("Indonasia's population is -> " + hashmap.get("INDONASIA") + " crore"); // Key doesn't exist, returns null

//         // -------- Iterate over both keys and values --------
//         for (Map.Entry<String, Integer> e : hashmap.entrySet()) {
//             System.out.println(e.getKey());   // Print key
//             System.out.println(e.getValue()); // Print corresponding value
//         }

//         // -------- Iterate over keys only --------
//         Set<String> keys = hashmap.keySet(); // Get all keys in the map

//         for (String key : keys) {
//             System.out.println(key + " " + hashmap.get(key));  // Print key and corresponding value
//         }
//     }
// }
