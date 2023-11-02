package introduction;

public class PerformingSingleTaskFromMultipleThread extends Thread{
    @Override
    public void run(){
        System.out.println("Performing single task from multiple thread.");
    }

    public static void main(String[] args){ // main thread create by JVM
        PerformingSingleTaskFromMultipleThread performingSingleTaskFromMultipleThread = new PerformingSingleTaskFromMultipleThread();
        performingSingleTaskFromMultipleThread.start(); // Thread1

        PerformingSingleTaskFromMultipleThread performingSingleTaskFromMultipleThread1 = new PerformingSingleTaskFromMultipleThread();
        performingSingleTaskFromMultipleThread1.start(); // Thread2
    }
}
