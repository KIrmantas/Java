package bir21;

public class Try3 {
    public static void main(String[] args) {
        Car car = new Car();
        try {
            car.increaseSpeed();
            car.increaseSpeed();
            car.increaseSpeed();
            car.increaseSpeed();
            car.increaseSpeed();
        } catch (CarCrashedException e) {   // pasiima pacio sukurta klaida
            e.printStackTrace();
        }
    }
}
