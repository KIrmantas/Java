package bir13;

import java.util.Scanner;

public class Anagrama {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite pirma zodi: ");
        String word1 = sc.nextLine();
        System.out.print("Iveskite antra zodi: ");
        String word2 = sc.nextLine();

        boolean anagram = true;

        for (int i = 0; i < word1.length(); i++) {
            if (word2.indexOf(word1.charAt(i)) < 0) {
                anagram = false;
                break;
            }
        }
        System.out.printf("Zodziai '%s' ir '%s' yra anagramos: %s", word1, word2, anagram);

    }
}
