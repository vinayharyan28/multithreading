package sleep;

/**
 1. If the value of milliseconds is negative then "IllegalArgumentException" is thrown.
 2. If the value of nanoseconds is not in the range 0-999999 then "IllegalArgumentException" is thrown.
 3. Whenever we want to use the sleep() method we also need to handle the "InterruptedException" if we will not handle it, the JVM will show a compilation error.
 4. When any thread is sleeping and if any other thread interrupts it, then it throws "InterruptedException"
 5. The sleep() method always pauses the current thread execution. When the JVM finds the sleep() method in code, it checks that which thread is running and pause the execution of thread.
 6. When we use sleep() method to pause the execution of thread. the thread scheduler assign the CPU to another thread any thread exists. so there is no guarantee that the thread wakes up exactly after the time specified in sleep() method. it totally depends on the thread scheduler.
 7. While the thread is sleeping, it doesn't lose any locks or monitors that it had acquired before sleeping.
 */

public class SleepTesting extends Thread{
    public static native void sleep(long milliSeconds) throws InterruptedException; // Implementation in another language

    public static void sleep(long milliSeconds, int nanoSeconds) throws InterruptedException{

    }

    @Override
    public void run(){
        for (int i=0; i<=5; i++){
            try {
                System.out.println(i);
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args){ // Create main thread
//        for (int i=0; i<=5; i++){
//            System.out.println(i);
//            try{
//                Thread.sleep(1000);
//            }catch (Exception e){
//                System.out.println(e);
//            }
//        }

        SleepTesting sleepTesting = new SleepTesting();
        sleepTesting.start();
    }
}
