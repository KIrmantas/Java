package bir13;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MasyvaiTuri {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite pirma sveiku skaiciu masyva (vienoje eiluteje, atskirtus tarpu):");
        String arrStr1 = sc.nextLine();
        System.out.println("Iveskite pirma sveiku skaiciu masyva (vienoje eiluteje, atskirtus tarpu):");
        String arrStr2 = sc.nextLine();

        List<Integer> arrNum1 = Stream.of(arrStr1.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> arrNum2 = Stream.of(arrStr2.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        for (Integer num : arrNum1) {
//            System.out.println(arrNum1[i] + " " + Arrays.asList(arrNum2).contains(arrNum1[i]));
            if (!arrNum2.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }
}
