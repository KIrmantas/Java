package myListWithArray;

import java.util.Arrays;

public class MyList{

    private Integer[] list;
    private int size;

//    public MyList() {
//        list = new Integer[size];
//        this.size = 0;
//    }

    public MyList(Integer ... arg) {
        this.size = arg.length;
        this.list = new Integer[this.size];
        this.list = arg;
    }

    public int getSize() {
        return size;
    }

    public void add(int value) {
        Integer[] temp = Arrays.copyOf(list, size + 1);
        temp[size] = value;
        size++;
        list = temp;
    }

    public void remove(int index) {
        if (list == null) {
            System.out.println("MyList tuscias");
        } else if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
//            System.out.println("Indeksas uz masyvo ribu");
        } else {
            Integer[] temp = new Integer[size - 1];
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
        if (size == 0) {
            return -1;
        }

        for (int i = 0; i < size; i++) {
            if (list[i] == value) {
                return i;
            }
        }
//        int i = 0;
//        while (i < size) {
//            if (list[i] == value) {
//                return i;
//            }
//            i++;
//        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(list);
    }
}
