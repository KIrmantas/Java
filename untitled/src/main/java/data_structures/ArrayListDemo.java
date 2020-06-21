package data_structures;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String>  studentai = new ArrayList<>();
        studentai.add("Tomas");
        studentai.add("Gintare");
        studentai.add("Petras");
        System.out.println(studentai);

        System.out.println(studentai.get(2));

        // iter - trumpinys
        for (String s : studentai) {
            System.out.println(s);
        }
    }
}
