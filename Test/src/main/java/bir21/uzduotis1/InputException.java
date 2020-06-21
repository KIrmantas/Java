package bir21.uzduotis1;

// paieska visame projekte CTRL + SHIFT + F

import java.util.Scanner;

public class InputException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Integer x = parseToInt(str);
        Double y;
        if (x == null) {
            y = parseToDouble(str);
            System.out.println(Object.class.getSimpleName());
            if (y == null) {
                System.out.println("Hey! That's not a value! Try once more");
            }
        }
/*
        try {
            int x = Integer.parseInt(str);
            System.out.println(int.class.getSimpleName() + " -> " + x);
        } catch (Exception e_int) {
            try {
                double x = Double.parseDouble(str);
                System.out.println(double.class.getSimpleName() + " -> " + x);
            } catch (Exception e_double) {
                System.out.println("Hey! That's not a value! Try once more");
            }
        } finally {
            sc.close();
        }
*/
    }

    static Integer parseToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }
    static Double parseToDouble(String str) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }

}
