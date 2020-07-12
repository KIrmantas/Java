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

        Optional<Person> findPerson = findbyName(persons, "Oona");
        if (findPerson.isPresent()) {
            System.out.println(findPerson.get());
        } // arba
        findPerson.ifPresent(p -> System.out.println(p));

        System.out.println(findPerson.orElse(new Person("test", 0)));
    }

    static Optional<Person> findbyName(List<Person> list, String name) {
        for (Person person : list) {
            if (person.getName().equalsIgnoreCase(name)) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }
}
