public class update_bit {
    public static void main(String []args){

//      0 -----------> 1

        int i = 1;
        int number = 5;// to change 0101 --> 0111
        int bitmask = 1<<i;//    0001--->0010
        int neww = bitmask|number;
        System.out.println(neww);


//      0 -----------> 1

        int j = 2;
        int numberr = 5;// to change 0101 --> 0001
        int bitmaskk = 1<<j;// 0001 ----> 0100
        //    ~0100    ---->    1011
        //     1011 & 0101 --> 0001
        int newww = (~bitmaskk)&numberr;
        System.out.println(newww);

    }
}
