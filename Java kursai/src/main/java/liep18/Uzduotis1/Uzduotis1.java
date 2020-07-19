package liep18.Uzduotis1;
/*
1. Using streams, for a given lists:
- [„John”, „Sarah”, „Mark”, „Tyla”, „Ellisha”, „Eamonn”]
- [1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50]
a) Sort the list.
b) Print only those names, that start with „E” letter.
c) Print values greater than 30 and lower than 200.
d) Print names uppercase.
e) Remove first and last letter, sort and print names.
f) *Sort backwards by implementing reverse Comparator and using lambda
expression.

Stream:
2. Take only even numbers, increase their value by square (n*n) and then print them
3. Write a program in Java to accept n numbers from keyboard and find their sum and average
 */


import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Uzduotis1 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        List<Integer> numbers = Arrays.asList(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);

        System.out.println("1 --- Sort ----- ");
        System.out.println(names.stream()
                .sorted()
                .collect(Collectors.toList()));

        System.out.println(numbers.stream()
                .sorted(Comparator.comparing(Integer::intValue))
                .collect(Collectors.toList()));

        numbers.stream().sorted(Comparator.comparingInt(n -> n)).collect(Collectors.toList());
        numbers.stream().sorted().collect(Collectors.toList());

        System.out.println("2 --- names, that start with „E” ----- ");
        names.stream().filter(n -> n.startsWith("E")).forEach(System.out::println);

        System.out.println("3 --- values greater than 30 and lower than 200 ----- ");
        System.out.println(numbers.stream()
                .filter(n -> n > 30 && n < 200)
                .collect(Collectors.toList()));

        System.out.println("4 --- names uppercase ----- ");
        System.out.println(names.stream().map(String::toUpperCase).collect(Collectors.joining(", ")));

        System.out.println("5 --- Remove first and last letter, sort and print names ----- ");
        System.out.println(names);
        String rez1 = names.stream()
                .map(n -> n.substring(1, n.length()-1))
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(rez1);

        System.out.println("6 --- Sort backwards by implementing reverse Comparator and using lambda expression ----- ");
        System.out.println(names);
        String rez2 = names.stream()
                .sorted((n1, n2) -> n2.compareToIgnoreCase(n1))
                .collect(Collectors.joining(", "));
        System.out.println(rez2);
        System.out.println(numbers);
        String rez3 = numbers.stream()
                .sorted((n1, n2) -> n1 - n2)
                .collect(Collectors.toList()).toString();
        System.out.println(rez3);

        System.out.println("6 --- Sort backwards by implementing reverse Comparator and using lambda expression ----- ");
        System.out.println(numbers);
        List<Integer> rez4 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(rez4);

    }
}

/*
public class Ex2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> numbers = new ArrayList<>();
    while (true) {
      System.out.println("Enter number: ");
      int number = scanner.nextInt();
      if (number == 0) {
        break;
      }
      numbers.add(number);
    }
    System.out.println(numbers);
    // 1
    int sum1 = numbers.stream().reduce(0, Integer::sum);
    System.out.println(sum1);
    // 2
    int sum2 = numbers.stream().collect(Collectors.summingInt(n -> n));
    System.out.println(sum2);
    // 3
    int sum3 = numbers.stream().mapToInt(n -> n).sum();
    System.out.println(sum3);
    // 1
    OptionalDouble average1 = numbers.stream().mapToInt(n -> n).average();
    average1.ifPresent(System.out::println);
    // // //
    IntSummaryStatistics statistics = numbers.stream().mapToInt(n -> n).summaryStatistics();
    System.out.println(statistics.getAverage());
    System.out.println(statistics.getSum());
  }
}
 */