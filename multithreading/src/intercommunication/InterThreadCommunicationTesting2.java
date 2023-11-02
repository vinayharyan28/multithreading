package intercommunication;

public class InterThreadCommunicationTesting2 {
    public static void main(String[] args) throws InterruptedException {
        TotalEarning2 totalEarning2 = new TotalEarning2();
        totalEarning2.start();

//        System.out.println("Total Earning: " + totalEarning2.total + "Rs");

        synchronized (totalEarning2){
            totalEarning2.wait();
            System.out.println("Total Earning: " + totalEarning2.total + "Rs");
        }
    }
}

class TotalEarning2 extends Thread{
    int total = 0; // Problem: print(0) before run execute

    @Override
    public void run(){
        synchronized (this){
            for (int i=1; i<=10; i++){
                total = total+100;
            }
            this.notify();
        }
    }
}
