package liep12.optional;

public class Person {
    @Override
    public String toString() {
        return "Name='" + name + "', age=" + age;
    }

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
