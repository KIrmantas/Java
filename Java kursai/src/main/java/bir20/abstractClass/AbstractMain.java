package bir20.abstractClass;

public class AbstractMain {
    public static void main(String[] args) {
        Car myCar = new Car(120, "Red");
        myCar.move(); // prints "Car moved"
        Vehicle myVehicle = myCar;
// Calling Car's implementation
// (myVehicle refers to a Car object).
        myVehicle.move(); // prints "Perrasytas abstract metodas"
    }
}

/*
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(123, "red");
        myCar.move();
        Vehicle vehicle = myCar;
        vehicle.move();
    }
}*/
