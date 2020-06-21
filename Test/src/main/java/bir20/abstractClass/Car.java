package bir20.abstractClass;

public class Car extends Vehicle {

    private String color;

    public Car(int maxSpeed, String color) {
        super(maxSpeed);
        color = color;
    }

    @Override
    public void move() {
        System.out.println("Perrasytas abstract metodas");
    }
}

/*public class Car extends Vehicle {
    private String color;
    public Car(int maxSpeed, String color) {
        super(maxSpeed);
        this.color = color;
    }
    @Override
    public void move() {
        System.out.println("Car moved");
    }
}*/
