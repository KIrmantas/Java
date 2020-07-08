package MyLinkedListGeneric;

// Sukurti savo List implementaciją kuri būtų paremta LinkedList principu,
// t.y. -> kiekvienas elementas turi nuorodą (property) į sekantį elementą



public class myLinkedListGenericMain {
    private MyLinkedListGeneric<Integer> list;

    public static void main(String[] args) {
        MyLinkedListGeneric<Integer> list = new MyLinkedListGeneric<>(11, 222);
        System.out.println("List = " + list);
        list.clear();
        System.out.println("Cleared list = " + list);
        System.out.println("List is empty: " + list.isEmpty());

        list.add(333);
        list.add(22);
        list.add(1);
        System.out.println("Supplemented list = " + list);

        int index = 0;
        list.add(index, 4444);
        System.out.println("Added to " + index + " place. List = " + list);

        index = 2;
        list.add(index, 55555);
        System.out.println("Added to " + index + " place. List = " + list);

        System.out.println("List size = " + list.size());

        int element = 22;
        System.out.println("Element '" + element + "' position: " + list.indexOf(element));
        element = 3333;
        System.out.println("Element '" + element + "' position: " + list.indexOf(element));

        element = 333;
        System.out.println("List has item '" + element + "': " + list.contains(element));

        index = 3;
        System.out.println("Element in " + index + " position: " + list.get(index));

        list.set(index, 0);
        System.out.println("Element in " + index + " position changed. List = " + list.toString());

        index = 4;
        list.remove(index);
        System.out.println("Element removed in position " + index + ". List = " + list.toString());

        if (list.remove((Integer) element)) {
            System.out.println("Removed '" + element + "'. List = " + list.toString());
        } else {
            System.out.println("Element '" + element + "' not found");
        }
    }
}
