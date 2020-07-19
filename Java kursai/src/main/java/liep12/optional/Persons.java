package liep12.optional;
// 1. Optional create
//  * Create a person class (name, age)
//  * Create a List of persons
//  * Create a method that finds person by name that return optional
// 2. Optional use
//  * If value from first task is present print it, use Optional.isPresent() and Optional.get()
//  * If value from first task is not present, use default person object (name="test", age= 0), use Optional.orElse()
//  * If value from first task is present, print persons age using Optional.map(), if it is not present, print 0


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Persons {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Jonas", 15));
        persons.add(new Person("Pertas", 25));
        persons.add(new Person("Ona", 78));
        persons.add(new Person("Ieva", 34));
        persons.add(new Person("Aidas", 32));


        Optional<Person> findPerson = findbyName(persons, "Ona");
//        if (findPerson.isPresent()) {
//            System.out.println(findPerson.get());
//        } // arba
//        findPerson.ifPresent(p -> System.out.println(p));
//        // arba
//        findPerson.ifPresent(System.out::println);

        System.out.println(findPerson.orElse(new Person("test", 0)));


//        for (Person p : persons) {
//            Optional<Person> pers = Optional.of(p);
//            System.out.println(pers.map(e -> e.getAge()).orElse(0));
//        }
        int age = findPerson.map(p -> p.getAge()).orElse(0);
        System.out.println(age);
    }

    static Optional<Person> findbyName(List<Person> list, String name) {
        for (Person person : list) {
            if (person.getName().equalsIgnoreCase(name)) {
                return Optional.of(person);
            }
        }

        return Optional.empty();
//        return list.stream().filter(p -> p.getName().equalsIgnoreCase(name)).findFirst().orElse();
    }
}

/*
public class Ex1 {
  public static void main(String[] args) {
    List<Person> persons = new ArrayList<>();
    persons.add(new Person("John", 18));
    persons.add(new Person("Carl", 20));
    persons.add(new Person("Tom", 13));
    persons.add(new Person("Bob", 8));
    persons.add(new Person("Rick", 45));
    persons.add(new Person("Morty", 16));
    Optional<Person> person = findByName(persons, "Bob");
    System.out.println(person);
    if (person.isPresent()) {
      System.out.println(person.get());
    }
    person.ifPresent(p -> System.out.println(p));
    Person person1 = person.orElse(new Person("test", 0));
    System.out.println(person1);
    // without optionals
    Person p1 = null;
    if (p1 != null) {
      Integer age = p1.getAge();
      if (age != null) {
        System.out.println(age);
      }
    }
    // with optional
    int age = person
        .map(p -> p.getAge())
        .orElse(0);
    System.out.println(age);
  }
  private static Optional<Person> findByName(
      List<Person> persons, String name
  ) {
    for (Person person : persons) {
      if (person.getName().equalsIgnoreCase(name)) {
        return Optional.of(person);
      }
    }
    return Optional.empty();
  }
}
 */