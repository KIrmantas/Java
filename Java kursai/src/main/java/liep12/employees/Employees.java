package liep12.employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Employees {

    public static int informationTime = 10_000;

    public static void main(String[] args) throws InterruptedException {

        Random rnd = new Random();

        Employee worker1 = new Employee("Jonas");
        Thread empl1 = new Thread(worker1);
        Thread empl2 = new Thread(new Employee("Petras"));
        Thread empl3 = new Thread(new Employee("Ona"));
        Thread empl4 = new Thread(new Employee("Birute"));
        Thread empl5 = new Thread(new Employee("Antanas"));

        List<Thread> emplss = new ArrayList<>();
        emplss.add(empl1);
        emplss.add(empl2);
        emplss.add(empl3);
        emplss.add(empl4);
        emplss.add(empl5);

        List<Thread> working = comeToWork(emplss, rnd);

        goHome(working, rnd);

//        Thread[] empls = {empl1, empl2, empl3, empl4, empl5};
//        int i = 0;
//        while (i < 5) {
//            int wait = rnd.nextInt(2_000);
//            Thread.sleep(wait);
//            int n = rnd.nextInt(5);
//            if (!empls[n].isAlive()) {
//                empls[n].start();
//                i++;
//            }
//        }
//
//        while (i > 0) {
//            Thread.sleep(10_000);
//            int n = rnd.nextInt(5);
//            if (empls[n].isAlive()) {
//                empls[n].interrupt();
//                i--;
//            }
//        }
    }

    private static List<Thread> comeToWork(List<Thread> emplss, Random rnd) throws InterruptedException {
        List<Thread> working = new ArrayList<>();
        while (emplss.size() > 0) {
            int wait = rnd.nextInt(5_000);
            Thread.sleep(wait);
            int n = rnd.nextInt(emplss.size());
            working.add(emplss.get(n));
            emplss.get(n).start();
            emplss.remove(n);
        }
        return working;
    }

    private static void goHome(List<Thread> working, Random rnd) throws InterruptedException {
        while (working.size() > 0) {
            Thread.sleep(20_000);
            int n = rnd.nextInt(working.size());
            working.get(n).interrupt();
            working.remove(n);
            informationTime -= 2000;
        }

    }

}
