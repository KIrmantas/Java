package bir21.uzduotis3;

public class GenericTestMain {
    public static void main(String[] args) {

        GenericTest<?>[] arr = new GenericTest[3];

        arr[0] = new GenericTest<>(2);
        arr[1] = new GenericTest<>(2.5);
        arr[2] = new GenericTest<>("Test");

        for (GenericTest<?> x :
                arr) {
            System.out.println(x.getValue().getClass().getSimpleName() + ": " + x.getValue());
        }
    }
/*
        GenericTest<String> ob1 = new GenericTest<>("Bla");
        GenericTest<String> ob2 = new GenericTest<>("Sha");
        int rez = ob1.biggerOfTwo(ob1, ob2);
        System.out.println(rez < 0 ? "Pirmas didesnis" : rez > 0 ? "Antras didesnis" : "Lygus");

        GenericTest<Integer> ob3 = new GenericTest<>(5);
        GenericTest<Integer> ob4 = new GenericTest<>(2);
        rez = biggerOfTwo1(ob3, ob4);
        System.out.println(rez < 0 ? "Pirmas didesnis" : rez > 0 ? "Antras didesnis" : "Lygus");

        GenericTest<Double> ob5 = new GenericTest<>(7.2);
        GenericTest<Double> ob6 = new GenericTest<>(-2.6);
        rez = biggerOfTwo1(ob3, ob4);
        System.out.println(rez < 0 ? "Pirmas didesnis" : rez > 0 ? "Antras didesnis" : "Lygus");
    }

    public static int biggerOfTwo1(GenericTest o1, GenericTest o2) {
        if (o1.getValue() instanceof Integer && o2.getValue() instanceof Integer) {
            return Integer.compare((int) o1.getValue(), (int) o2.getValue());

        } else if (o1.getValue() instanceof Double && o2.getValue() instanceof Double) {
            return Double.compare((Double) o1.getValue(), (Double) o2.getValue());

        } else if (o1.getValue() instanceof String && o2.getValue() instanceof String) {
            return ((String) o1.getValue()).compareTo((String) o2.getValue());
        }
        return 0;
    }

    public static int biggerOfTwo2(GenericTest o1, GenericTest o2) {
        if (o1.getValue() instanceof Integer && o2.getValue() instanceof Integer) {
            return Integer.compare((int) o1.getValue(), (int) o2.getValue());

        } else if (o1.getValue() instanceof Double && o2.getValue() instanceof Double) {
            return Double.compare((Double) o1.getValue(), (Double) o2.getValue());

        } else if (o1.getValue() instanceof String && o2.getValue() instanceof String) {
            return ((String) o1.getValue()).compareTo((String) o2.getValue());
        }
        return 0;
*/


//    public static <T extends Comparable> T biggerOfTwo(T first, T second) {
//        if (first.compareTo(second) >= 0) {
//            return first;
//        } else {
//            return second;
//        }
//        return first.compareTo(second) >= 0 ? first : second;
//    }

}
