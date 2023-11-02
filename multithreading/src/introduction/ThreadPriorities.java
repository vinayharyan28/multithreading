package introduction;

public class ThreadPriorities extends Thread{
    @Override
    public void run(){
        System.out.println("Priorities thread.");
        System.out.println(Thread.currentThread().getPriority()); // Inherit from parent thread.
    }

    public static void main(String[] args) {
        System.out.println("Old: " + Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(10);
        System.out.println("New: " + Thread.currentThread().getPriority());
        ThreadPriorities threadPriorities = new ThreadPriorities();

        threadPriorities.start();
    }
}
