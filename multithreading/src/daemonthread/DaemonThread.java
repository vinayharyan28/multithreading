package daemonthread;

public class DaemonThread extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().isAlive());
        System.out.println("Daemon thread."); // Run background when main method is run
    }

    public static void main(String[] args) {
        System.out.println("Main thread."); // We can't create main thread as daemon thread
        // It's life depends on another thread
        DaemonThread daemonThread = new DaemonThread(); // Provide service to main thread
        daemonThread.setDaemon(true); // We have to create daemon before starting the thread
        daemonThread.start(); // Daemon nature: It inherits the properties from is parent thread

    }
}
