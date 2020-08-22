package L.Good;

public class LiskovSubstitutionDemo {
    public static void run() {
        Car car1 = new Car();

        Car[] cars = {car1};

        // Now it works!
        // Because all are cars and CarWreck is not called when it cannot move!
        for (Car car :
                cars) {
            car.move();
        }
    }
}
