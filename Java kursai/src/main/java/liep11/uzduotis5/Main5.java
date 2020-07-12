package liep11.uzduotis5;

public class Main5{
    public static void main(String[] args)  throws InterruptedException {
        Thread testClass1 = new Thread(new TestClass(1,7));  // new Thread - kad turetume gijos objekta
        Thread testClass2 = new Thread(new TestClass(2, 10));
        Thread testClass3 = new Thread(new TestClass(3,5));
        Thread testClass4 = new Thread(new TestClass(4, 15));

        TestClass testClass5 = new TestClass(5, 10);
        new Thread(testClass5).start();
        Thread test = new Thread(testClass5);
        test.start();

        testClass1.start();
        testClass2.start();
        testClass3.start();
        testClass4.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main ciklas");
            Thread.sleep(1000);
            testClass4.interrupt();
        }
//        Thread.sleep(3000);
    }


}
