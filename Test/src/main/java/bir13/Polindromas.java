package bir13;

import java.util.Scanner;

public class Polindromas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite zodi: ");
        String word = sc.nextLine();
        boolean polind = true;
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length-1-i)) {
                polind = false;
            }
        }
        System.out.println("Ar zodis '" + word + "' polindromas: " + polind);
    }
}
