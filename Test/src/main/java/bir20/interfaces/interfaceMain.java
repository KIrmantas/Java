package bir20.interfaces;

public class interfaceMain {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle(2, 3);
        shapes[1] = new Circle(3);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new Pentagon(3);


        for (Shape shape :
                shapes) {
            System.out.printf("%s plotas = %.2f\n", shape.getClass().getSimpleName(), shape.getArea());
            System.out.printf("%s perimetras = %.2f\n", shape.getClass().getSimpleName(), shape.getPerimeter());
        }
    }
}

