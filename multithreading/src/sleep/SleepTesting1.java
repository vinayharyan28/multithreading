package sleep;

public class SleepTesting1 extends Thread{
    @Override
    public void run(){
        try{
            for(int i=0; i<=5; i++){
                System.out.println(i + " : " + Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        SleepTesting1 sleepTesting1 = new SleepTesting1();
        sleepTesting1.start();

        SleepTesting1 sleepTesting2 = new SleepTesting1();
        sleepTesting2.start();
    }

}
