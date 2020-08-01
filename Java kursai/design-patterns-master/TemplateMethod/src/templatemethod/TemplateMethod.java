package templatemethod;

import templatemethod.example.Capriciosa;
import templatemethod.example.Margharita;
import templatemethod.example.Pizza;
import templatemethod.exercise.BubbleSort;
import templatemethod.exercise.BucketSort;
import templatemethod.exercise.FruttiDiMare;
import templatemethod.exercise.Sort;

public class TemplateMethod {

    public static void main(String[] args) {
        Pizza margharita = new Margharita();
        Pizza capriciosa = new Capriciosa();
        margharita.bakingPizza();
        System.out.println("-----------------");
        capriciosa.bakingPizza();

//        System.out.println("-----------------");
//        Pizza fruttiDiMare = new FruttiDiMare();
//        fruttiDiMare.bakingPizza();
//
//        Sort bubbleSort = new BubbleSort();
//        Sort bucketSort = new BucketSort();
//        bubbleSort.sortArray(10);
//        System.out.println("-----------------");
//        bucketSort.sortArray(10);
    }

}
