package bir20.muzzle;

public class MuzzleMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Tutis", new Muzzle("Red", 12));
        System.out.println(dog.getName());
        System.out.println(dog.getMuzzle().getColor());
        System.out.println(dog.getMuzzle().getSize());


    }
}
