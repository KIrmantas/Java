package bir20.interfaces;

// taisyklingas penkakampis
public class Pentagon implements Shape {
    double a;

    public Pentagon(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return Math.sqrt(25 + 10 * Math.sqrt(5)) * a * a / 4;
    }

    @Override
    public double getPerimeter() {
        return 5 * a;
    }
}
