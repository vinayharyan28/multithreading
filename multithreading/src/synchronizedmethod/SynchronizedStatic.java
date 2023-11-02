package synchronizedmethod;



public class SynchronizedStatic{ // Issue create different reference for objects
    public static void main(String[] args) {
        BookTheaterSeatStatic bookTheaterSeatStatic = new BookTheaterSeatStatic();

        Thread1ForStaticSynchronized t1 = new Thread1ForStaticSynchronized(bookTheaterSeatStatic, 7);
        t1.start();

        Thread2ForStaticSynchronized t2 = new Thread2ForStaticSynchronized(bookTheaterSeatStatic, 6);
        t2.start();

        Thread1ForStaticSynchronized t3 = new Thread1ForStaticSynchronized(bookTheaterSeatStatic, 7);
        t3.start();

        Thread2ForStaticSynchronized t4 = new Thread2ForStaticSynchronized(bookTheaterSeatStatic, 6);
        t4.start();


    }
}

class Thread1ForStaticSynchronized extends Thread{
    BookTheaterSeatStatic bookTheaterSeatStatic;
    int seats;
    public Thread1ForStaticSynchronized(BookTheaterSeatStatic bookTheaterSeatStatic, int seats){
        this.bookTheaterSeatStatic = bookTheaterSeatStatic;
        this.seats = seats;
    }

    @Override
    public void run(){
        BookTheaterSeatStatic.booKSeat(seats);
    }
}


class Thread2ForStaticSynchronized extends Thread{
    BookTheaterSeatStatic bookTheaterSeatStatic;
    int seats;
    public Thread2ForStaticSynchronized(BookTheaterSeatStatic bookTheaterSeatStatic, int seats){
        this.bookTheaterSeatStatic = bookTheaterSeatStatic;
        this.seats = seats;
    }

    @Override
    public void run(){
        BookTheaterSeatStatic.booKSeat(seats);
    }
}



class BookTheaterSeatStatic{
    static int total_seats = 10;

    synchronized static void booKSeat(int seats){ // Provide two
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
