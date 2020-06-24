package bir21.uzduotis4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> data = inputData(sc);

        printList(data);

        data = removeElem(data, sc);

        printList(data);

        List<String> newList = data.stream().filter(s -> s.startsWith("m")).collect(Collectors.toList());
        printList(newList);


//        System.out.print("Kuri elementa surasti: ");
//        String elem = sc.nextLine();
//        index = data.indexOf(elem);
//        if (index == -1) {
//            System.out.println("Elementas nerastas");
//        } else if (index == data.size()) {
//            System.out.println("Sekancio elemento nera");
//        } else {
//            System.out.println("Sekantis po rasto: " + data.get(index + 1));
//        }


        sc.close();

    }

    static List<String> inputData(Scanner sc) {
        List<String> data = new ArrayList<>();
        System.out.println("Iveskite teksta. Pabaigai iveskite 0");
        while (true) {
            String str = sc.nextLine();
            if (str.equalsIgnoreCase("0")) {
                break;
            }
            if (!data.contains(str)) {
                data.add(str);
            }
        }
        return data;
    }

    static void printList(List<String> data) {
        System.out.println("-----------");
        IntStream.range(0, data.size()).forEach(i -> {
            String x = data.get(i);
            System.out.println(i + 1 + " - " + x);
        });
        System.out.println();
    }

    static List<String> removeElem(List<String> data, Scanner sc) {
        System.out.print("Nurodykite kuri elementa salinsite: ");
        String deleteElem = sc.nextLine();
        int index = data.indexOf(deleteElem);
        if (index == -1) {
            System.out.println("Elementas nerastas");
        } else {
            data.remove(index);
        }
        return data;
    }

    // su stream reikia bandyt sugrupuoti po 2 elementus
    private static List<String> filterFirstBySecondLetter(List<String> list, String letter) {
        List<String> newList = new ArrayList<>();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String current = iterator.next();
            if (!iterator.hasNext()) {
                break;
            }
            String next = iterator.next();
            if (next.toLowerCase().startsWith(letter.toLowerCase())) {
                newList.add(current);
            }
        }
        return newList;
    }
}
