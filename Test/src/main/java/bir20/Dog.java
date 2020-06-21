package bir20;

public class Dog {
    private String name;    // vardas
    private int age;        // amzius
    private String gender;  // lytis
    private String rase;    // rusis
    private double weight;  // svoris


    public Dog(String name, int age, String gender, String rase, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.rase = rase;
        this.weight = weight;
    }

    public Dog(String gender, String rase) {
        this("", 0, gender, rase, 0.0);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
        this.weight = weight; }
        else {
            System.out.println("Svoris turi but teigiamas");
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", rase='" + rase + '\'' +
                ", weight=" + weight +
                '}';
    }
}
