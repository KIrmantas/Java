package classes;

public class Person extends Human {
    private String firstName;
    private String lastName;
    public Person(Integer age, Gender gender, String firstName, String lastName) {
        super(firstName, age, gender);
        this.firstName = firstName;
        this.lastName = lastName;
    }
    @Override
    public String getTitle() {
        return null;
    }
}