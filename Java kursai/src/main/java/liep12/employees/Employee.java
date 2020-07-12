package liep12.employees;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee implements Runnable {

    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        String time = LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss"));
        System.out.printf("%s: I came to work at %s\n", name, time);
        while (true) {
            try {
                Thread.sleep(Employees.informationTime);
            } catch (InterruptedException e) {
                time = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
                System.out.printf("<%s: %s, it's time to go home!\n", name, time);
                break;
            }
            System.out.println(name + ": I’m still working!"); // Info time: " + Employees.informationTime);
        }
    }
}
