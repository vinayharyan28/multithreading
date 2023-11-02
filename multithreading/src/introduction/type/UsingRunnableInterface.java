package introduction.type;

public class UsingRunnableInterface implements Runnable{
    @Override
    public void run() { // Best compare to Thread class
        System.out.println("Thread is running.");
    }

    public static void main(String[] args) {
        UsingRunnableInterface test2 = new UsingRunnableInterface();
        Thread thread = new Thread(test2);
        thread.start();
    }
}
