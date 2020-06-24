package bir21.uzduotis3;

public class GenericTest<V> {
//public class GenericTest<V> implements Comparable {
    private final V value;

    public GenericTest(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

//    public int biggerOfTwo(GenericTest o1, GenericTest o2) {
//        if (o1.value instanceof Integer && o2.value instanceof Integer) {
//            return Integer.compare((int) o1.value, (int) o2.value);
//        } else if (o1.value instanceof Double && o2.value instanceof Double) {
//            return Double.compare((Double) o1.value, (Double) o2.value);
//        } else if (o1.value instanceof String && o2.value instanceof String) {
//            return ((String) o1.value).compareTo((String) o2.value);
//        }
//        return 0;
//    }

}
