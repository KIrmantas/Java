package liep18.uzduotis3;

public class Main {
    public static void main(String[] args) {
        Person.Builder builder = Person.Builder.newBuilder();

        builder.setAge(5)
                .setFirstName("Jonas")
                .setLastName("Jonaitis")
                .setCountry("Kaunas")
                .setEducation("Mokykla")
                .setGender("Vyras");

        Person person = builder.build();
        System.out.println(person);

        // palengvina sudetingo objekto sukurima, galima paudot validacija
        //

        Person person1 = Person.Builder.newBuilder()
                .setAge(12)
                .setFirstName("Bob")
                .build();

        System.out.println(person1);

    }
}
/*
public static void main(String[] args) {
    Person.Builder builder = Person.Builder.newBuilder();
    builder
        .setFirstName("Bob")
        .setLastName("Ross")
        .setAge(18)
        .setCountry("Lithuania")
        .setEducation("School")
        .setGender("Male");
    Person person = builder.build();
    System.out.println(person);
    Person person2 = Person.Builder.newBuilder()
        .setAge(12)
        .setFirstName("Bob")
        .build();
    Person person1 = new Person(
        18,
        "Bob",
        "Ross",
        "Lithuania",
        "Male",
        "School");
  }

 */