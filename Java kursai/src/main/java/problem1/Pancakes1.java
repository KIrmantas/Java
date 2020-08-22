package problem1;
// https://codingcompetitions.withgoogle.com/codejam/round/0000000000201bee/0000000000201d17?fbclid=IwAR357YZCmqwmyjKQW7cu3TbQ8EbjNshELSgwV9i30BQ42ZV5DbK-GqDBPZ0
// '+' - "happy side"
// '-' - "blank side"

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Pancakes1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("'+' - pancake with a happy side");
        System.out.println("'-' - pancake with a blank side");
        System.out.print("Input number of test cases: ");

        int testCasesNumber = sc.nextInt();
        String[] pancakes = new String[testCasesNumber];

        System.out.println("Input a row of pancakes from the happy and blank sides");
        for (int i = 0; i < testCasesNumber; i++) {
            System.out.printf("Case #%d: ", i + 1);
            pancakes[i] = sc.next();
        }

        for (int i = 0; i < testCasesNumber; i++) {
            System.out.printf("Case #%d: %d%n", i + 1, countnumberOfGroups(pancakes[i]));
        }
    }

    private static int countnumberOfGroups(String pancakesRow) {
        int numberOfGroups = pancakesRow.endsWith("-") ? 1 : 0;
        numberOfGroups += pancakesRow.length() - pancakesRow.replace("-+", "#").length();
//        numberOfGroups += pancakesRow.split("\\+\\-").length - 1;
        numberOfGroups += StringUtils.countMatches(pancakesRow, "+-");
        return numberOfGroups;
    }
}
