package bir20.abstractClass;

public class RectangleCircleMain {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(2, 3);
        shapes[1] = new Circle(3);

        for (Shape shape :
                shapes) {
            System.out.println(shape.getClass().getSimpleName());
            System.out.printf("%.2f\n", shape.getArea());
            System.out.printf("%.2f\n",shape.getPerimeter());
        }


        Rectangle rectangle = new Rectangle(2, 3);
        System.out.println(rectangle.getArea());
        rectangle.setHight(4);
        rectangle.setWidth(5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Circle circle = new Circle(3);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        circle.setRadius(3.5);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

    }
}

