package liep11.uzduotis3_pabaigti;

import java.util.Map;
import java.util.Scanner;

// duoti 2 zodziai.
// Patikrinti ar jie vienas kito anagrmos (t.y. sudaryti is tu paciu raidziu
public class uzduotis3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Įveskite pirmą žodį: ");
        String zodis1 = sc.nextLine();

        System.out.print("Įveskite antrą žodį: ");
        String zodis2 = sc.nextLine();

        Map<String, Integer> mapZodis1 = getMapFromString(zodis1);
    }

    private static Map<String, Integer> getMapFromString(String zodis) {
//        Map <Character, Integer> charCounts = zodis.chars()
//                .mapToObj(e -> (char) e).
//
        return null;
    }
}
