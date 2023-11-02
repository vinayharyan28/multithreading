package synchronizedmethod;

public class SynchronizeMethod extends Thread{
    static BookTheaterSeatSynchronizeCheck bookTheaterSeatSynchronizeCheck;
    int seats;

    @Override
    public void run(){
        bookTheaterSeatSynchronizeCheck.booKSeat(seats); // Two person execute same time
    }

    public static void main(String[] args) {
        bookTheaterSeatSynchronizeCheck = new BookTheaterSeatSynchronizeCheck();
        SynchronizeMethod synchronizeMethods = new SynchronizeMethod();
        synchronizeMethods.seats = 7;
        synchronizeMethods.start();

        SynchronizeMethod synchronizeMethod1 = new SynchronizeMethod();
        synchronizeMethod1.seats = 6;
        synchronizeMethod1.start();
    }
}


class BookTheaterSeatSynchronizeCheck{
    int total_seats = 10;

    synchronized void booKSeat(int seats){ // Object lock, Object area
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