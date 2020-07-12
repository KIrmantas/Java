package liep11.uzduotis5;

public class TestClass  implements Runnable{
    private int id;
    private int value;

    public TestClass(int id, int value) {
        this.id = id;
        this.value = value;
    }

    private void printWord() {
        System.out.println(id + ": Hello " + value);
    }

    @Override
    public void run() {
        while (value >= 0) {
            printWord();
            value--;
            try {
                Thread.sleep(10_000);
            } catch (InterruptedException e) {
                System.out.println(id + " thread interupted");
                break;
            }
        }
    }
}
