package bir21.uzduotis2;

public class Person implements Comparable<Person> {
    private String name;
    private double height;

    public Person(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public int compareTo(Person o) {
        return this.height - o.height;
    }

}
