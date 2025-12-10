class sleepmethod extends Thread{
    public void run(){
        for(int i = 1; i<=5;i++){
            try{
                Thread.sleep(700);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
public class Thread_sleep_demo {
    public static void main(String args[]){
        sleepmethod s1 = new sleepmethod();
        sleepmethod s2 = new sleepmethod();
        sleepmethod s3 = new sleepmethod();
        s1.start();
        s2.start();
        s3.start();

    }
}
