package bir20.abstractClass;

public class Rectangle extends Shape {

    public Rectangle(double width, double hight) {
        super(width, hight, 0);
    }

    @Override
    public double getArea() {
        return getWidth() * getHight();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getWidth() + getHight());
    }
}
