package interrupt;

public class InterruptTesting1 extends Thread{

    @Override
    public void run(){
        System.out.println("Is thread interrupted: " + Thread.interrupted()); // Change interrupt status true -> false
        System.out.println("Is thread isInterrupted: " + Thread.currentThread().isInterrupted());
        try {
            for(int i=1; i<=5; i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        InterruptTesting1 interruptTesting1 = new InterruptTesting1();
        interruptTesting1.start();
        interruptTesting1.interrupt();
    }
}
