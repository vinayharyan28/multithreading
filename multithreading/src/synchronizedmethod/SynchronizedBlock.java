package synchronizedmethod;

public class SynchronizedBlock extends Thread{
    static BookTheaterSeatSynchronizeBlockCheck bookTheaterSeatSynchronizeBlockCheck;
    int seats;

    @Override
    public void run(){
        bookTheaterSeatSynchronizeBlockCheck.booKSeat(seats); // Two person execute same time
    }

    public static void main(String[] args) {
        bookTheaterSeatSynchronizeBlockCheck = new BookTheaterSeatSynchronizeBlockCheck();
        SynchronizedBlock synchronizedBlock = new SynchronizedBlock();
        synchronizedBlock.seats = 7;
        synchronizedBlock.start();

        SynchronizedBlock synchronizedBlock1  = new SynchronizedBlock();
        synchronizedBlock1.seats = 6;
        synchronizedBlock1.start();
    }
}


class BookTheaterSeatSynchronizeBlockCheck{ // Part of code synchronized // Run only particular code
    int total_seats = 10;

    void booKSeat(int seats){ // Object lock, Object area
         // 1000 line code
         System.out.println("Check synchronized block1: " + Thread.currentThread().getName());
         System.out.println("Check synchronized block2: " + Thread.currentThread().getName());
         System.out.println("Check synchronized block3: " + Thread.currentThread().getName());
         System.out.println("Check synchronized block4: " + Thread.currentThread().getName());
         System.out.println("Check synchronized block5: " + Thread.currentThread().getName());

         synchronized (this){
             if (total_seats >= seats){
                 System.out.println("Seat booked successfully.");
                 total_seats = total_seats - seats;
                 System.out.println("Seats left: " + total_seats);
             }else {
                 System.out.println("Seats are not available.");
                 System.out.println("Seats left: " + total_seats);
             }
         }

         // 1000 line code
         System.out.println("Check synchronized block6: " + Thread.currentThread().getName());
         System.out.println("Check synchronized block7: " + Thread.currentThread().getName());
         System.out.println("Check synchronized block8: " + Thread.currentThread().getName());
         System.out.println("Check synchronized block9: " + Thread.currentThread().getName());
         System.out.println("Check synchronized block10: " + Thread.currentThread().getName());

     }
}
