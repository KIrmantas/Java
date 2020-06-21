package bir21;

public class CarCrashedException extends Exception {
    public CarCrashedException(Car car) {

        super("Car " + car + " has crashed!");
    }
}

//public class CarCrashException extends Exception {
//    public CarCrashException(Car car) {
//        super("Car " + car + " has crashed");
//    }
//}