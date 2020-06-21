package bir20;

public class RectangleCircleMain {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println(rectangle.getArea());
        rectangle.setHight(4);
        rectangle.setWidth(5);
        System.out.println(rectangle.getArea());

        Circle circle = new Circle(2);
        System.out.println(circle.getArea());
        circle.setRadius(3.5);

    }
}

/*
import classes.Circle;
        import classes.Rectangle;
        import classes.Shape;
public class Main8 {
    public static void main(String[] args) {
        Shape shape = new Shape(20, 50);
        Rectangle rectangle = new Rectangle(120, 40, 20);
        Circle circle = new Circle(20.2, 15, 9);
        System.out.println(shape.getHeight());
        System.out.println(rectangle.getPerimeter());
        System.out.println(circle.getRadius());
    }
}
*/
