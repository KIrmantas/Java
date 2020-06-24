package myListWithArrayGeneric;

import java.util.Arrays;

public class MyList1<T>{

    private Object[] list;
    private int size;

    @SafeVarargs
    public MyList1(T ... arg) {
        this.size = arg.length;
        this.list = new Object[this.size];
        this.list = arg;
    }

    public int getSize() {
        return size;
    }

    public void add(T value) {
        Object[] temp = Arrays.copyOf(list, size + 1);
        temp[size] = (T) value;
        size++;
        list = temp;
    }

    public void remove(int index) {
        if (list == null) {
            System.out.println("MyList tuscias");
        } else if (index < 0 || index >= size) {
            System.out.println("Indeksas uz masyvo ribu");
        } else {
            Object[] temp = new Object[size - 1];
            int i = 0;
            for (; i < index; i++) {
                temp[i] = list[i];
            }
            for (; i < size-1; i++) {
                temp[i] = list[i+1];
            }
            size--;
            list = temp;
        }
    }

    public void sort() {
        Arrays.sort(list);
    }

    public int getIndexOf(int value) {
        if (list == null) {
            return -1;
        }

        int i = 0;
        while (i < size) {
            if (list[i].equals(value)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }
}
