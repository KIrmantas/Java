package data_structures;

import java.util.*;

public class QueueDemo {

    public static void main(String[] args) {
        Queue<String> eileZmoniu = new LinkedList<>();
        eileZmoniu.add("Tomas");
        eileZmoniu.add("Paulius");
        eileZmoniu.add("Gintare");
        for (String zmogus : eileZmoniu) {
            System.out.println(zmogus);
        }
        eileZmoniu.remove();
        System.out.println("_________________");
        for (String zmogus : eileZmoniu) {
            System.out.println(zmogus);
        }
        eileZmoniu.add("Gvidas");
        eileZmoniu.add("Algis");
        System.out.println("_________________");
        for (String s : eileZmoniu) {
            System.out.println(s);
        }
    }
}

