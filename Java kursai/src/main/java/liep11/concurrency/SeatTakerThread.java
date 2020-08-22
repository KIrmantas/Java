package liep11.concurrency;

public class SeatTakerThread extends Thread {
    private Bench bench;
    private String id;

    public SeatTakerThread(Bench bench, String id) {
        this.bench = bench;
        this.id = id;
    }
    @Override
    public void run() {
        bench.takeASeat(id);
    }
}