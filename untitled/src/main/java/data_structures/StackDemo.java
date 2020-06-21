package data_structures;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<String> lekstes = new Stack<>();
        lekstes.push("Lekste 1");
        lekstes.add("Lekste 2"); // galima add, kadangi yra List implementas
        lekstes.push("Lekste 3");
        lekstes.push("Lekste 4");

        for (String e : lekstes) {
            System.out.println(e);
        }
        System.out.println("--------------");
        System.out.println(lekstes.peek()); // virsutinis elementas

        System.out.println("--------------");
        for (String e : lekstes) {
            System.out.println(e);
        }

        lekstes.pop();
        System.out.println("--------------");
        for (String e : lekstes) {
            System.out.println(e);
        }

    }
}
