package bir13;

import java.util.Scanner;

public class Apversti {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Iveskite skaiciu: ");
        int num = sc.nextInt();
        int newNum = 0;
        while (num != 0) {
            newNum = newNum * 10 + num % 10;
            num = num / 10;
        }
        System.out.println("Apverstas skaicius: " + newNum);
    }
}
