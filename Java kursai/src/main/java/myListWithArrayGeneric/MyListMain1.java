package myListWithArrayGeneric;

public class MyListMain1 {
    public static void main(String[] args) {
        int size = 8;
//        MyList1<Integer> myList = new MyList1<>(-2, -7);
        MyList1<String> myList = new MyList1<>("-2", "-7");
        for (int i = 0; i < size; i++) {
//            myList.add(2 * (size - i) + 1);
            myList.add(String.valueOf((char)(i + 97)));
        }
        System.out.println(myList);

        myList.sort();

        System.out.println("Surusiuotas myList");
        System.out.println(myList);

        System.out.println("Rasto skaiciaus '-7' pozicija = " + myList.getIndexOf("-3"));
        System.out.println("Rasto raidės 'e' pozicija = " + myList.getIndexOf("e"));

//        System.out.println("Pasalina elementa su indeksu -2 ");
//        myList.remove(-2);
        System.out.println(myList);
        System.out.println("Pasalina elementa su indeksu 0 ");
        myList.remove(0);
        System.out.println(myList);
        System.out.println("Pasalina elementa su indeksu 3 ");
        myList.remove(3);
        System.out.println(myList);
        System.out.println("Pasalina elementa su indeksu 7 ");
        myList.remove(7);
        System.out.println(myList);

        System.out.println("Mylist dydis: " + myList.getSize() );
    }
}
