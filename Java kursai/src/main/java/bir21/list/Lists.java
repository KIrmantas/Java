package bir21.list;

import java.util.ArrayList;
import java.util.Iterator;
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
        for(int i = 0; i < list.size(); i++) {
            // array[i]
            String listElement = list.get(i);
            System.out.println(listElement);
        }
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
