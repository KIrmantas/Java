package liep11.concurrency;

public class Bench {
    private int availableSeats;

    public Bench(int availableSeats) {
        this.availableSeats = availableSeats;
    }
    public synchronized void takeASeat(String id) {
        if (availableSeats > 0) {
            System.out.println(id + " is taking a seat.");
            availableSeats--;
            System.out.println(id + " took a seat, seats left: " + availableSeats);
        }
        else {
            System.out.println(id + " has no available seats :(");
        }
    }
}