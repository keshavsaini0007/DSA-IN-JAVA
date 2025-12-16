import java.util.LinkedList;
import java.util.ArrayList;

public class HashMapCode {
    static class HashMap<K,V> {
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n; // no. of nodes 
        private int N;  // size of arr or buckets

        private LinkedList<Node> buckets[]; // N = buckets
    
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i = 0; i<4; i++){
                this.buckets[i] = new LinkedList<Node>();
            }
        }

        public int hashFunction(K key){
            int bi = key.hashCode(); // hashcode exists in java which returns a value 
            // bi can be 12324 or -32441 
            // but we want +ve value then we use |mod|  -> abs <- absolute value

            return Math.abs(bi) % N;   // abs(bi) -> absolute value of bi
            //                         // bi % N returns value less then N 
        }

        private int searchInLL(K key , int bi){
            LinkedList<Node> ll = buckets[bi];
            for(int i = 0; i<ll.size(); i++){
                if(ll.get(i).key == key){
                    return i; // we have to return index value
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldbuckets[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i = 0; i<N*2; i++){
                buckets[i] = new LinkedList<>();   // LinkedList<Node>()       <-- is not must..
            }

            for(int i = 0; i<oldbuckets.length; i++){
                LinkedList<Node> LL = oldbuckets[i];
                for(int j = 0; j<LL.size(); j++){
                    Node node = LL.get(j);
                    put(node.key,node.value);     // call put F(x) to copy the data of old array to the new modified array...
                }
            }
        }

        public void put(K key,V value){
            int bi = hashFunction(key);  // bi -> bucket index
            int di = searchInLL(key,bi); // di -> data index <- where data(Node) of LL is stored or to be...
            
            if(di == -1){ // key doesn't exists...
            // it means we have to add the key and value at bi 
            buckets[bi].add(new Node(key,value));
            n++;
            }
            else {  // key exists...
                Node node = buckets[bi].get(di);
                node.value = value;
            }

            double lambda = (double)n/N;
            if(lambda > 2.0){
                // rehashing
                rehash();
            }
        }

        public boolean containsKey(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1){  // key doesn't exists
                return false;
            } else {       // key exists
                return true;
            }
        }

        public  V remove(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1){  // key doesn't exists 
                return null;
            } else {       // key exists
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;

            }
        }

        public V get(K key){
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            if(di == -1){    //  key doesn't exists
                return null;
            } else{          // key exists
                Node node = buckets[bi].get(di);
                return node.value;
            }
        }
        
        public ArrayList<K> keySet(){

            ArrayList<K> keys = new ArrayList<>();

            for(int i = 0; i<buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(int j = 0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }
    public static void main (String args[]){
        HashMap<String,Integer> Map = new HashMap<>();

        Map.put("india",190);
        Map.put("china", 200);
        Map.put("US",50);

        ArrayList<String> keys = Map.keySet();
        for(int i = 0 ; i<keys.size(); i++){
            System.out.println(keys.get(i)+" "+Map.get(keys.get(i)));
        }

        Map.remove("india");
        System.out.println(Map.get("india"));
    }
}