package assignment.afterclass10;

public class ThreadWaitNotify {
    public static void main(String[] args){
        ThreadNotify b = new ThreadNotify();
        b.start();
 
        synchronized(b){
            try{
                System.out.println("Waiting for b to complete...");
                b.wait();
                System.out.println("after wait");
            }catch(InterruptedException e){
                e.printStackTrace();
            }
 
            System.out.println("Total is: " + b.total);
        }
    }
}
 
class ThreadNotify extends Thread{
    int total;
    @Override
    public void run(){
        synchronized(this){
            for(int i=0; i<100 ; i++){
                total += i;
            }
            //notify();
        }
    }
}
