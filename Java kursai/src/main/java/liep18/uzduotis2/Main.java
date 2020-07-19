package liep18.uzduotis2;

import java.text.Collator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number N: ");
        int number = sc.nextInt();

        Set<Integer> seeDigits = new HashSet<>();
        int i = 1;
        while (seeDigits.size() < 10 && i <= 20) {
            System.out.println(i * number);
            seeDigits.addAll(digitsToSet(i * number));
            System.out.println(seeDigits + " length: " + seeDigits.size());
            i++;
        }
    }

    private static Set<Integer> digitsToSet(int n) {
        Set<Integer> rez = String.valueOf(n).chars().mapToObj(x ->  x - 48).collect(Collectors.toSet());

//        Set<Integer> rez1 = new HashSet<>();
//        while (n > 0) {
//            rez1.add(n % 10);
//            n = n / 10;
//        }
        return rez;
    }
}
