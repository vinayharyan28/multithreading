package joinmethod;

public class JoinMethodTesting1 extends Thread{
    @Override
    public void run(){
        for (int i=0; i<=5; i++){
            try {
                System.out.println("Child thread " + i);
                Thread.sleep(1000);
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        JoinMethodTesting1 joinMethodTesting1 = new JoinMethodTesting1();
        joinMethodTesting1.start();

        for (int i=1; i<=5; i++){
            try {
                System.out.println("Main thread: " + i);
                Thread.sleep(1000);
                joinMethodTesting1.join();
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
    }
}
