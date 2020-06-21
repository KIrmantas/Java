package src.sda.bir13;

import java.util.Scanner;

public class parasiutininkas {

    final static double G = 9.8;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Is kokios aukscio soka parasiutininkas, m: ");
        double h = sc.nextDouble();

        System.out.print("Per kiek laiko issiskleidzia parasiutas, s: ");
        double t_parasiutas = sc.nextDouble();

        double issiskleis = Math.sqrt(2 * h / G);

        System.out.println(issiskleis <= t_parasiutas ? "Neissiskleide" : "Issiskleide");

        if (issiskleis <= t_parasiutas) {
            System.out.println("Neissiskleide");
        } else {
            System.out.println("Issiskleide");
        }
    }
}
