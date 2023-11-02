package joinmethod;

public class JoinMethodTesting2 extends Thread{
    static Thread mainThread;
    @Override
    public void run() {

        for (int i=1; i<=5; i++){
            System.out.println("Child thread: " + i);
            try {
                mainThread.join();
                Thread.sleep(1000);
                System.out.println("Child Thread: " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        JoinMethodTesting2 joinMethodTesting2 = new JoinMethodTesting2();
        mainThread = Thread.currentThread();
        joinMethodTesting2.start();
        for(int i=1; i<=5; i++){
            Thread.sleep(1000);
            System.out.println("Main Thread: " + i);
        }

    }
}
