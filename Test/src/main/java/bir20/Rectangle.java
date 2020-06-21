package bir20;

public class Rectangle extends Shape {
    double area;

    public Rectangle(double width, double hight) {
        super(width, hight, 0);
    }

    public double getArea() {
        return getWidth() * getHight();
    }
}
/*public class Rectangle extends Shape {
    private int perimeter;
    public Rectangle(int perimeter, int width, int height) {
        super(width, height);
        this.perimeter = perimeter;
    }
    public int getPerimeter() {
        return perimeter;
    }
}*/
