package bir20;

public class VehicleCarMain {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(250);
        System.out.println(vehicle.getMaxSpeed());

        Car car = new Car(220, false);
        System.out.println(car.getMaxSpeed());
        System.out.println(car.isConvertible());

        Vehicle vehicle1 = new Car(150, true);
        System.out.println(vehicle1.getMaxSpeed());

        Car car1 = (Car) vehicle1; // galima kastinti abjektus. Jie turi but matomi (paveldimi) vienas is kito

        System.out.println(car1);
        System.out.println(vehicle);
    }
}
