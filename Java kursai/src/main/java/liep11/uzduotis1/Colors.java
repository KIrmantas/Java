package liep11.uzduotis1;
//1. Create a set consisting of colors - given from the user.
//        2. Present the removal of individual elements from the set.
//        3. Display the collection before and after sorting.
import java.util.*;

public class Colors {
    public static void main(String[] args) {
        Set<String> colors;
        Scanner sc = new Scanner(System.in);

        colors = inputColors(sc);

        System.out.println("Įvestos spalvos: ");
        printSet(colors);

        // Alt + Enter - pazymetą kodą konvertuoja į metodą
        removeColor(colors, sc);

        List<String> sortet = new ArrayList<>(colors);
        Collections.sort(sortet);

        Set<String> sotetColors = new TreeSet<>(colors);

        System.out.println("Surušiuotos spalvos: ");
        System.out.println(sotetColors);
        System.out.println(sortet);

    }

    private static void removeColor(Set<String> colors, Scanner sc) {
        System.out.print("Įveskite trinamą spalvą: ");
        String removeColor = sc.nextLine();

        if (colors.remove(removeColor)) {
            System.out.println("Spalva ištrinta");
        } else {
            System.out.println("Tokios spalvos aibėje nėra");
        }
        printSet(colors);
    }

    public static Set<String> inputColors(Scanner sc) {
        Set<String> colors = new HashSet<>();
        System.out.println("Įvedimo nutraukimui įveskite 'N'");
        while (true) {
            System.out.print("Iveskite spalvą: ");
            String color = sc.nextLine();
            if (color.equalsIgnoreCase("N")) {
                break;
            }
            colors.add(color);
        }
        return colors;
    }

    public static void printSet (Set<String> colors) {
        // galima ir taip
        //System.out.println(colors);
        for (String c : colors) {
            System.out.print(c + " " +  c.hashCode() + " ");
        }
        System.out.println();
    }
}
