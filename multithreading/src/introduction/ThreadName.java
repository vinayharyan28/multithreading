package introduction;

public class ThreadName extends Thread{
    @Override
    public void run(){
        System.out.println("Task");
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
         System.out.println(Thread.currentThread().getName());
         Thread.currentThread().setName("vinay");
         System.out.println(Thread.currentThread().getName());

        ThreadName threadName = new ThreadName();
        threadName.start();
        System.out.println(Thread.currentThread().isAlive());
        System.out.println("Thread name: " + threadName.isAlive());
    }
}
