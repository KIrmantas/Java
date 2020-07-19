import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Testing {
    public static void main(String[] args) {
        String word1 = "lėkiau";
        String word2 = "kiaulė";

//        Map<Character, Integer> charsCounts = new HashMap<>();
//        for (char c : word1.toCharArray()) {
//            if (charsCounts.containsKey(c)) {
//                charsCounts.replace(c, charsCounts.get(c) + 1);
//            } else {
//                charsCounts.put(c, 1);
//            }
//        }
//        System.out.println(charsCounts);
//
//        charsCounts.clear();
//        for (char c : word1.toCharArray()) {
//            charsCounts.put(c, charsCounts.getOrDefault(c, 0) + 1);
//        }
//        System.out.println(charsCounts);

        Map<Character, Integer> rez1 = getCharacterIntegerMap(word1);
        Map<Character, Integer> rez2 = getCharacterIntegerMap(word2);
        System.out.println("Pirmo žodžio: " + rez1);
        System.out.println("Antro žodžio: " + rez2);
        System.out.println("Ar anagramos: " + rez1.equals(rez2));
        //(Map<String, Integer>) word.chars().collect(Collectors.toMap(String::chars, Function.identity()));
    }

    private static Map<Character, Integer> getCharacterIntegerMap(String word) {
        return word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toMap(Function.identity(), c -> 1, Math::addExact));
    }
}
