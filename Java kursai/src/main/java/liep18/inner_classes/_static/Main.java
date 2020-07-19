package liep18.inner_classes._static;


public class Main {
    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
// Prints 40
        System.out.println(bicycle.getMaxSpeed());

        Bicycle.Wheel wheel = bicycle.new Wheel();
        wheel.damage();
// Prints 20
        System.out.println(bicycle.getMaxSpeed());
    }
}
