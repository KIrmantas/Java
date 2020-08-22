package liep12.lambdaExpression;

import java.util.Random;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Jonas", 30);
        Predicate<Person> adultPersonTest = new AudtPersonTest();
        System.out.println(adultPersonTest.test(person));

        // paprasciau. Testavimui
        Predicate<Person> adultPersonTest2 = p -> p.getAge() < 18;
        boolean isTrue = adultPersonTest2.test(person);
        System.out.println(isTrue);

        Runnable myRunnable = () -> System.out.println("Running a runnable");
        myRunnable.run();

        Predicate<String> startsWithABCTest = s -> s.startsWith("ABC");
        System.out.println(startsWithABCTest.test("ABCDEF"));

        // pirmas - paduodamas parametras, antras - grazimas parametras
        Function<String, Integer> strLength = text -> text.length();
        Function<String, Integer> strLength2 = String::length;
        int length = strLength.apply("testas");

        Function<String, String> replaceCommas = text -> text.replaceAll(",", ".");
        String text = "a,b,c";
        System.out.println(replaceCommas.apply(text));

        // tik grazina
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt();
        int randomNumber = randomNumberSupplier.get();

        // tik priima, bet nieko negrazna
        Consumer<Double> printWithPrefixConsumer = d -> System.out.println("Value: " + d);
        printWithPrefixConsumer.accept(10.5);

        // priima ir razina viena parametra
        UnaryOperator<Integer> toSquareUnaryOperator = i -> i * i;
        System.out.println(toSquareUnaryOperator.apply(5));

        UnaryOperator<Integer> toSquareUnaryOperator2 = getIntegerUnaryOperator();
        System.out.println(toSquareUnaryOperator.apply(5));

    }

    private static UnaryOperator<Integer> getIntegerUnaryOperator() {
        return i -> {
            int a = i;
            return i * i;
        };
    }

//    public class Main {
//        public static void main(String[] args) {
//            Person person = new Person("Andy", 30);
//            Predicate<Person> adultPersonTest = new AdultPersonTest();
//            boolean isAdult = adultPersonTest.test(person);
//            System.out.println(isAdult);
//            Predicate<Person> personPredicate =
//                    new Predicate<Person>() {
//                        @Override
//                        public boolean test(Person person) {
//                            return false;
//                        }
//                    };
//            Predicate<Person> personTest = p -> p.getAge() < 18;
//            boolean isNotAdult = personTest.test(person);
//            System.out.println(isNotAdult);
//            Runnable runnable = () -> System.out.println("Other thread");
//            runnable.run();
//            System.out.println("Main thread");
//            Predicate<String> startsWithABCText =
//                    text -> text.startsWith("ABC");
//            System.out.println(startsWithABCTextMethod("ABCde"));
//            System.out.println(startsWithABCText.test("ABCde"));
//            // text -> text.length()
//            Function<String, Integer> strLength = String::length;
//            int length = strLength.apply("text");
//            System.out.println(length);
//            Function<String, String> replaceCommas = text ->
//                    text.replaceAll(",", ".");
//            String textWithoutCommas = replaceCommas.apply("Text, commas, has");
//            System.out.println(textWithoutCommas);
//            Supplier<Integer> randomNumber = () -> new Random().nextInt();
//            System.out.println(randomNumber.get());
//            System.out.println(randomNumber.get());
//            System.out.println(randomNumber.get());
//            System.out.println(randomNumber.get());
//            Consumer<Double> printWithPrefix =
//                    number -> System.out.println("Value: " + number);
//            printWithPrefix.accept(5.5);
//            UnaryOperator<Integer> unaryOperator = i -> {
//                int a = i;
//                return i * i;
//            };
//            System.out.println(unaryOperator.apply(5));
//        }
//        public static boolean startsWithABCTextMethod(String text) {
//            return text.startsWith("ABC");
//        }
//    }
}
