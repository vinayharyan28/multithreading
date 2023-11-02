package synchronizedmethod;

public class SynchronizedTesting extends Thread{
    static BookTheaterSeatSynchronizeTesting bookTheaterSeatSynchronizeTesting;
    int seats;

    @Override
    public void run(){
        bookTheaterSeatSynchronizeTesting.booKSeat(seats); // Two person execute same time
    }

    public static void main(String[] args) {
        bookTheaterSeatSynchronizeTesting = new BookTheaterSeatSynchronizeTesting();
        SynchronizedTesting SynchronizedTesting = new SynchronizedTesting();
        SynchronizedTesting.seats = 7;
        SynchronizedTesting.start();

        SynchronizedTesting synchronizedTesting1  = new SynchronizedTesting();
        synchronizedTesting1.seats = 6;
        synchronizedTesting1.start();
    }
}

class BookTheaterSeatSynchronizeTesting{
    int total_seats = 10;

    synchronized void booKSeat(int seats){ // Execute one by one not parallel access at same time
        if (total_seats >= seats){
            System.out.println("Seat booked successfully.");
            total_seats = total_seats - seats;
            System.out.println("Seats left: " + total_seats);
        }else {
            System.out.println("Seats are not available.");
            System.out.println("Seats left: " + total_seats);
        }

    }
}