public class get_bit {
    public static void main(String[]args){
        int i = 2; // position
        int n = 5; //  0101 
        int bitmask = 1<<i;  // bit mask

        // 1<<i ---> 0100 & 0101<--5  
 //               & --> 0100 ---> non zero
        if((bitmask&n)==0){System.out.println("bit was zero");}  
        else System.out.println("bit was one");
    
    }   
} 
