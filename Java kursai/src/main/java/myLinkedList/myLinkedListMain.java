package myLinkedList;

public class myLinkedListMain {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList("A", "Bb");
        System.out.println("List = " + list);
        list.clear();
        System.out.println("Cleared list = " + list);
        System.out.println("List is empty: " + list.isEmpty());

        list.add("Cc");
        list.add("Bbb");
        list.add("Aaaa");
        System.out.println("Supplemented list = " + list);

        int index = 0;
        list.add(index, "first");
        System.out.println("Added to " + index + " place. List = " + list);

        index = 2;
        list.add(index, "second");
        System.out.println("Added to " + index + " place. List = " + list);

        System.out.println("List size = " + list.size());

        String element = "Bbb";
        System.out.println("Element '" + element + "' position: " + list.indexOf(element));
        element = "Ccc";
        System.out.println("Element '" + element + "' position: " + list.indexOf(element));

        element = "Aaaa";
        System.out.println("List has item '" + element + "': " + list.contains(element));

        index = 3;
        System.out.println("Element in " + index + " position: " + list.get(index));

        list.set(index, "new");
        System.out.println("Element in " + index + " position changed. List = " + list.toString());

        index = 4;
        list.remove(index);
        System.out.println("Element removed in position " + index + ". List = " + list.toString());

        if (list.remove(element)) {
            System.out.println("Removed '" + element + "'. List = " + list.toString());
        } else {
            System.out.println("Element '" + element + "' not found");
        }
    }
}
