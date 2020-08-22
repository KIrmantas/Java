package liep12.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> textOptional = Optional.of("Reiksme");
        textOptional.ifPresent(System.out::println);
        System.out.println(textOptional.orElse("Abc"));
        System.out.println(textOptional.filter(s -> s.length() > 5).get());
        System.out.println(textOptional.map(s -> s + " word").get());
        String text = null;
        if (text == null){
            return;
        }
        System.out.println(text.length());
    }
}