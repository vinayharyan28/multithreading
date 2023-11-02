package joinmethod;

public class JoinMethodTesting3 {
    public static void main(String[] args) throws InterruptedException {
        Medical medical = new Medical();
        medical.start();
        medical.join();

        TestDrive testDrive = new TestDrive();
        testDrive.start();
        testDrive.join();

        OfficerSign officerSign = new OfficerSign();
        officerSign.start();

    }
}

class Medical extends Thread{
    @Override
    public void run(){
        try {
            System.out.println("Medical starts.");
            Thread.sleep(3000);
            System.out.println("Medical is completed.");
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}

class TestDrive extends Thread{
    @Override
    public void run(){
        try {
            System.out.println("Test drive starts.");
            Thread.sleep(5000);
            System.out.println("Test drive completed.");
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}


class OfficerSign extends Thread{
    @Override
    public void run(){
        try {
            System.out.println("Officer is signing.");
            Thread.sleep(5000);
            System.out.println("Licence process done.");
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}