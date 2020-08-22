package liep11.concurrency;

public class BenchMain {
    public static void main(String[] args) {
        Bench bench = new Bench(1);
        SeatTakerThread seatTaker1 = new SeatTakerThread(bench, "First");
        SeatTakerThread seatTaker2 = new SeatTakerThread(bench, "Second");
        seatTaker1.start();
        seatTaker2.start();
    }
}
