package interrupt;

public class InterruptTesting extends Thread{
    @Override
    public void run(){
        try {
            for (int i=1; i<=5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        InterruptTesting interruptTesting = new InterruptTesting();
        interruptTesting.start();
        interruptTesting.interrupt();
    }
}
