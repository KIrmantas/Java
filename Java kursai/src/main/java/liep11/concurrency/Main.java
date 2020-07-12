package liep11.concurrency;
// paleidzia kelis skaiciavimus vienu metu

public class Main {
    public static void main(String[] args) throws InterruptedException{

        StopWatchThread stopWatchThread1 = new StopWatchThread();
        StopWatchThread stopWatchThread2 = new StopWatchThread();
        stopWatchThread1.start();
        stopWatchThread2.start();

        System.out.println("Main thread starts");
        Thread.sleep(5000); //5 s
        System.out.println("Main thread is still running");
        Thread.sleep(5000);
        System.out.println("Main thread ends");
    }
}
