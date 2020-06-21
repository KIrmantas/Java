package bir20;

public class Circle extends Shape {
    double area;

    public Circle(double radius) {
        super(0, 0, radius);
    }

    public double getArea() {
        return Math.PI * getRadius() * getRadius();
    }
}

/*
public class Circle extends Shape {
    private double radius;
    public Circle(double radius, int width, int height) {
        super(width, height);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
}
*/
