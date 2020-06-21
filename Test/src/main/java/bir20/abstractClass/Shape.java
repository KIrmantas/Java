package bir20.abstractClass;
/*
Create a Shape class.
        a) Add fields, create constructor, getters and setters.
        b) Create classes Rectangle and Circle. Both of them should inherit class Shape.
        Which fields and methods are common?
*/

public abstract class Shape {
    private double width;
    private double hight;
    private double radius;

    public Shape(double width, double hight, double radius) {
        this.width = width;
        this.hight = hight;
        this.radius = radius;
    }

    public abstract double getArea();

    public abstract double getPerimeter();


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

