package problem1;
// https://codingcompetitions.withgoogle.com/codejam/round/0000000000201bee/0000000000201d17?fbclid=IwAR357YZCmqwmyjKQW7cu3TbQ8EbjNshELSgwV9i30BQ42ZV5DbK-GqDBPZ0
// '+' - "happy side"
// '-' - "blank side"

import java.util.Scanner;

public class Pancakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("'+' - pancake with a happy side");
        System.out.println("'-' - pancake with a blank side");
        System.out.print("Input number of test cases: ");

        int testCasesNumber = sc.nextInt();
        char[][] pancakes = new char[testCasesNumber][];

        System.out.println("Input a row of pancakes from the happy and blank sides");
        for (int i = 0; i < testCasesNumber; i++) {
            System.out.printf("Case #%d: ", i + 1);
            String row = sc.next();
            pancakes[i] = row.toCharArray();
        }

        for (int i = 0; i < testCasesNumber; i++) {
            char[] pancakesRow = pancakes[i];
            int numberOfGroups = countGroups(pancakesRow);
            int caseNumber = numberOfGroups + (pancakesRow[pancakesRow.length - 1] == '+' ? -1 : 0);
            System.out.printf("Case #%d: %d%n", i + 1, caseNumber);
        }
    }

    private static int countGroups(char[] pancakes) {
        int numberOfGroups = 1;
        char pancakeSide = pancakes[0];
        for (char c : pancakes) {
            if (pancakeSide != c) {
                numberOfGroups++;
                pancakeSide = c;
            }
        }
        return numberOfGroups;
    }
}
