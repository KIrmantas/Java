package bir20.interfaces;

public class Rectangle implements Shape {

    private double width;
    private double hight;

    public Rectangle(double width, double hight) {
        this.hight = hight;
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * hight;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + hight);
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
}
