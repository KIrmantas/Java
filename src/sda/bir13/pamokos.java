package src.sda.bir13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pamokos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> dienos = new ArrayList<>();

        System.out.print("Kiek dienu vyko pamokos? ");
        int d_sk = sc.nextInt();

        for (int i = 0; i < d_sk; i++) {
            System.out.print("Įveskite pamokų skaičių " + (i + 1) + " dieną: ");
            dienos.add(sc.nextInt());
        }

        int sum = 0;
        for (int x : dienos) {
            sum += x;
        }
//        System.out.print("Įveskite pamokų skaičių pirmadienį: ");
//        int d1 = sc.nextInt();
//        System.out.print("Įveskite pamokų skaičių antradienį: ");
//        int d2 = sc.nextInt();
//        System.out.print("Įveskite pamokų skaičių tečiadienį: ");
//        int d3 = sc.nextInt();
//        System.out.print("Įveskite pamokų skaičių ketvirtadienį: ");
//        int d4 = sc.nextInt();
//        System.out.print("Įveskite pamokų skaičių penktadienį: ");
//        int d5 = sc.nextInt();
//
//        int sum = d1 + d2 + d3 + d4 + d5;
        System.out.println("Pamokų saičius: " + sum);
        System.out.println("Tai sudaro minučių: " + sum * 45);
    }
}
