package bir21.uzduotis3;

public class GenericTestMain {
    public static void main(String[] args) {
        GenericTest<String> ob1 = new GenericTest<>("Bla");
        GenericTest<String> ob2 = new GenericTest<>("Sha");
        int rez = ob1.biggerOfTwo(ob1, ob2);
        System.out.println(rez);

        GenericTest<Integer> ob3 = new GenericTest<>(5);
        GenericTest<Integer> ob4 = new GenericTest<>(2);
        rez = ob3.biggerOfTwo(ob3, ob4);
        System.out.println(rez);
    }
}
