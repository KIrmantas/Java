package bir20;

/*
a) Add private fields to the class, like name, age, gender, race, weigth.
        b) Create constructor that accepts all of the class fields.
        c) Create additional constructor, that will accept only gender and race. It should call main constructor with default values.
        d) Create getters and setters for age and weigth.
        e) Create object of class Dog. Verify if everything works as expected.
        f) Add verification for all arguments passed to the setters. E.g. setWeigth method should not accept values below or equal to 0.
*/

public class DogMain {
    public static void main(String[] args) {
//        Dog dog1 = new Dog("Tutis", 9, "Male", "Husky", 12.3);
//        System.out.println(dog1);
//        Dog dog2 = new Dog("Female", "Blaa");
//        System.out.println(dog2);
//        dog2.setWeight(-12.2);
//        System.out.println(dog2.getWeight());
//
        Dog dog = new Dog("John", 2, "Male", "Husky", 15.1);
        System.out.println(dog.getAge());
        System.out.println(dog.getWeight());
        Dog dog1 = new Dog("Male", "Husky");
        System.out.println(dog1.getAge());
        System.out.println(dog1.getWeight());
        System.out.println(dog.getWeight());
        dog.setWeight(-5);
        System.out.println(dog.getWeight());

    }
}
