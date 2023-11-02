package yieldmethod;

/**
 Which stops the current executing thread and give a chance to other threads for execution

 */
public class YieldMethodTesting extends Thread{
    @Override
    public void run(){
        for (int i=0; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) {
        YieldMethodTesting yieldMethodTesting = new YieldMethodTesting();
        yieldMethodTesting.start();
        Thread.yield(); // If you want main method to stop and provide chance to other threads fpr execution.
        for (int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

}
