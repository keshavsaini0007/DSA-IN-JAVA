
public class bitwise_operator {
    public static void main(String[]args){
        int x = 5 , y = 4;
//     5--> 0101
//     4--> 0100

//              binary AND
        if((x&y)==4){System.out.println("4-->0100");}
        //   0101
        // & 0100
        //-> 0100

//              binary OR
        if((x|y)==5){System.out.println("5-->0101");}
        //   0101
        // | 0100
        //-> 0101

//              binary XOR
        if((x^y)==1){System.out.println("1-->0001");}
        //   0101
        // | 0100
        //-> 0001

//              binary COMPLEMENT
        System.out.println(~x);
        // if((~x)==10){System.out.println("10-->1010");}
        //  ~0101----> 1010
        
//              binary left SHIFT

        System.out.println(x<<2);    
        // 0101<<2 ------> 010100-->(20)
    
        System.out.println(x>>2);    
        // 0101>>2 ------> 0001-->(1)
    }
}