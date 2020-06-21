package bir21.generic;

public class Main {
    public static void main(String[] args) {
        GenericBox<Integer> genericBox = new GenericBox<>(2);
        System.out.println(genericBox.getClass().getSimpleName() + " -> " + genericBox.getItem());

        GenericBox<String> genericBox1 = new GenericBox<>("Stringas");
        System.out.println(genericBox1.getItem());

        // i generic klase gaima paduoti bet kokio tipo, kad ir kita klase, exeption

        Car car = new Car();
        Garage<Car> garage = new Garage<>(car);
        garage.repairVehicle();

        Car1 car1 = new Car1(150);
        Car1 car2 = new Car1(200);
        if (car1.compareTo(car2) > 0) {
            System.out.println("car1 is faster");
        }else {
            System.out.println("car1 is slover");
        }

    }
}
