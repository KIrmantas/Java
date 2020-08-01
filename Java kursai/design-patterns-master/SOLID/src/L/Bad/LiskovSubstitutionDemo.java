package L.Bad;

public class LiskovSubstitutionDemo {
    public static void run() {
        Car car1 = new Car();
        Car car2 = new CarWreck();

        Car[] cars = {car1, car2};

        // Fail! CarWreck should not be able to move!
        for (Car car :
                cars) {
            car.move();
        }
    }
}
