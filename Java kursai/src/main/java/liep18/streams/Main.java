package liep18.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael");

        Optional<String> name = findByName(names, "Brandon");

        Stream<String> namesStream = names.stream();

        Optional<String> name1 = names.stream()
                .filter(n -> n.equalsIgnoreCase("Brandon"))
                .findFirst();

        List<String> namesCopy1 = names.stream().collect(Collectors.toList());

        List<String> nameFromA = names.stream()
                .filter(n -> n.startsWith("A")).collect(Collectors.toList());
        System.out.println(nameFromA);

        List<Integer> namesLength = names.stream().map(n -> n.length()).collect(Collectors.toList());
        System.out.println(namesLength);

        OptionalDouble doubleOptional = names.stream().mapToInt(n -> n.length()).average();
        doubleOptional.orElse(0);
        doubleOptional.ifPresent(avr -> System.out.println(avr));

        // visu ilgiai > 3
        boolean allLengthGt3 = names.stream()
                .allMatch(n -> n.length() > 3);
        // bent vieno ilgis > 3
        boolean anyLengthGt3 = names.stream().anyMatch(n -> n.length() > 3);

        // sujungia visas reiksmes i viena
        String namesConcatenation = names.stream()
                .reduce("",  // pradine reiksme
                        // currentValue - esama reiksme
                        // next - sekanti reiksme
                        (current, next) -> current + ", " + next);
        System.out.println(namesConcatenation);

        System.out.println("1 ------------");
        namesConcatenation = names.stream()
                .reduce("",
                        (currValue, element) -> (currValue.equals("") ? "" : currValue + ", ") + element);
        System.out.println(namesConcatenation);

        System.out.println("2 ------------");
        names.stream().forEachOrdered(n -> System.out.println(n));
        names.forEach(System.out::println);


        List<Person> persons = Arrays.asList(
                new Person("John", "Smith", 20),
                new Person("Sarah", "Connor", 30),
                new Person("Alan", "Daton", 25));

        System.out.println("3 ------------");
        persons.stream().sorted((p1, p2) -> p1.getSurname().compareTo(p2.getSurname()))
                .forEach(p -> System.out.println(p.getSurname()));

        System.out.println("4 ------------");
        persons.stream().sorted((p1, p2) -> p1.getAge() - p2.getAge())
                .forEach(p -> System.out.println(p.getAge()));

        System.out.println("5 ------------");
        persons.stream().sorted(Comparator.comparing(Person::getSurname))
                .forEach(System.out::println);

        System.out.println("6 ------------");
        List<Person> sortedPersons = persons.stream()
                .sorted(Comparator.comparing(Person::getSurname))
                .collect(Collectors.toList());
        System.out.println(sortedPersons);


    }

    private static Optional<String> findByName(List<String> names, String nameToLook) {
        for (String name : names) {
            if (name.equalsIgnoreCase(nameToLook)) {
                return Optional.of(name);
            }
        }
        return Optional.empty();
    }
}

/*
public class Main {
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Andrew", "Brandon", "Michael", "John", "Bob");
    Optional<String> optionalName = findByName(names, "Andrew");
    Optional<String> optionalName1 =
        names.stream().filter(n -> n.equalsIgnoreCase("Andrew")).findFirst();
    Stream<String> stream = names.stream();
    List<String> namesCopy = stream.collect(Collectors.toList());
    Optional<String> firstName = names.stream().findFirst();
    List<String> namesFromA =
        names.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
    System.out.println(namesFromA);
    List<Integer> namesLength =
        names.stream().map(name -> name.length()).collect(Collectors.toList());
    System.out.println(namesLength);
    OptionalDouble doubleOptional = names.stream().mapToInt(name -> name.length()).average();
    doubleOptional.ifPresent(average -> System.out.println(average));
    boolean allLengthGt3 = names.stream().allMatch(name -> name.length() > 3);
    System.out.println(allLengthGt3);
    boolean atLeastOneWith3 = names.stream().anyMatch(name -> name.length() > 3);
    System.out.println(atLeastOneWith3);
    String nameConcatenation =
        names.stream()
            .reduce("", (current, next) -> (current.equals("") ? "" : current + ", ") + next);
    System.out.println(nameConcatenation);
    // streams way
    names.forEach(name -> System.out.println(name));
    //    old way
    for (String name : names) {
      System.out.println(name);
    }
    List<Person> persons =
        Arrays.asList(new Person("John", "Smith", 20), new Person("Sarah", "Connor", 30));
    // one way to sort
    persons.stream()
        .sorted((p1, p2) -> p1.getSurname().compareTo(p2.getSurname()))
        .forEach(System.out::println);
    // alternative
    persons.stream().sorted(Comparator.comparing(Person::getSurname)).forEach(System.out::println);
    List<Person> sortedPersons = persons.stream()
        .sorted((p1, p2) -> p1.getSurname().compareTo(p2.getSurname()))
        .collect(Collectors.toList());
  }
  private static Optional<String> findByName(List<String> names, String nameToLook) {
    for (String name : names) {
      if (name.equalsIgnoreCase(nameToLook)) {
        return Optional.of(name);
      }
    }
    return Optional.empty();
  }
}

 */