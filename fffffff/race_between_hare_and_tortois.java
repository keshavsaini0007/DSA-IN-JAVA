class tortois extends Thread{
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("distance covered by tortois = "+i);
        }
        System.out.println("tortois has completed the race");
    }
}
class hare extends Thread{
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("distance covered by hare is = "+i);
        }
        System.out.println("hare has completed the race");
    }
}

public class race_between_hare_and_tortois {
    public static void main(String args[]){
        tortois t = new tortois();
        hare h  = new hare();
        t.start();
        h.start();
    }
    
}
