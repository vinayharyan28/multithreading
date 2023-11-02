package introduction.type;

public class UsingThreadClass extends Thread{
    @Override
    public void run(){
        System.out.println("Processing thread");
    }

    public static void main(String[] args){
        UsingThreadClass t = new UsingThreadClass();
        t.start();
    }
}
