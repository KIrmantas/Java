package bir20;

public class Car extends Vehicle{
    private  boolean convertible;

    public Car(int maxSpeed, boolean convertible) {
        super(maxSpeed);
        this.convertible = convertible;
    //    maxSpeed = 3;  // galima kreiptis i tevo kalses parametra
    //    super.maxSpeed = 5; // jei yra protect
        System.out.println(super.getMaxSpeed());
    }

    public boolean isConvertible() {
        return convertible;
    }

    @Override
    public String toString() {
        return "Car{" +
                "convertible= " + convertible + " " + super.toString() +
                '}';
    }
}
