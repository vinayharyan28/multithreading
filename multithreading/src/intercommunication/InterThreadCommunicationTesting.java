package intercommunication;

/**
 Inter-thread communication is a mechanism in which a thread releases the lock and enter into paused state and another thread acquires the lock and continue to execute.
 It is implemented by following methods of Object class:

 1. wait(): If any thread call the wait() method, it causes the current thread to release the lock and wait until another thread
            invokes to notify() or notifyAll() method for this object or a specified of time has elapsed.
    Syntax: public final void wait() throws interruptedException (waits until object is notified)
    public final void wait (long timeout) trows interruptedException (waits for the specified amount of time)

 2. notify(): This method is used to wake up a single thread and releases the object lock
    Syntax: public final notify()

 3. notifyAll(): This method is used to wake up all threads that are in waiting state.
    Syntax: public final void notifyAll()

 Note: To call wait(), notify(), or notifyAll() method on any object, thread should own the lock of that object.
 that is the thread should be inside synchronized area
 */

public class InterThreadCommunicationTesting {
    public static void main(String[] args) {
        TotalEarning totalEarning = new TotalEarning();
        totalEarning.start();

        System.out.println("Total Earning: " + totalEarning.total + "Rs");
    }
}

class TotalEarning extends Thread{
    int total = 0; // Problem: print(0) before run execute

    @Override
    public void run(){
        synchronized (this){
            for (int i=1; i<=10; i++){
                total = total+100;
            }
        }

    }
}

