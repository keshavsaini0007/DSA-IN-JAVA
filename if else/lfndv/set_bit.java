public class set_bit {
    public static void main(String[]args){
        int i = 1; // position
        int number = 5; //  0101 
        int bitmask = 1<<i;  // bit mask

        // 1<<i ---> 0010 & 0101<--5  
 //               |  --> 0111 ---> setted
        int x = bitmask | number ;
        System.out.println(x);
    }
}
