package introduction;

public class PerformingMultipleTaskFromMultipleThread{
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.start();

        MyThread2 t2 = new MyThread2();
        t2.start();
    }
}

class MyThread1 extends Thread{
    @Override
    public void run(){
        System.out.println("Task1");
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        System.out.println("Task2");
    }
}