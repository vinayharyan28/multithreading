package introduction;

public class PerformingSingleTaskFromSingleThread extends Thread{
    @Override
    public void run(){
        System.out.println("Performing single task");
    }

    public static void main(String[] args){
        PerformingSingleTaskFromSingleThread performingSingleTaskFromSingleThread = new PerformingSingleTaskFromSingleThread();
        performingSingleTaskFromSingleThread.start();
    }
}
