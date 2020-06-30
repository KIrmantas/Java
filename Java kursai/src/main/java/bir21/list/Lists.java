package bir21.list;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // String[] array = new String[5]
        List<String> list = new ArrayList<>();
        // array[0] = "first";
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");
        list.remove("third");
        for (String listElement : list) {
            // array[i]
            System.out.println(listElement);
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
