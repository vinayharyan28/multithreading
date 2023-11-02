package introduction;

public class PerformingMultipleTaskFromSingleThread extends Thread{
    @Override
    public void run(){
        // This is not possible
        System.out.println("This is not possible.");
    }
}
