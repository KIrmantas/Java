package bir20.abstractClass;

public class Circle extends Shape {

    public Circle(double radius) {
        super(0, 0, radius);
    }

    private double getRAdius(){
        return  getWidth() / 2d;
    }

    @Override
    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }
}

