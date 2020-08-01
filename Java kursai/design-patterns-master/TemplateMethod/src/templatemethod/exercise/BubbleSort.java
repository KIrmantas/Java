package templatemethod.exercise;

public class BubbleSort extends Sort {

    @Override
    protected void sort() {
        System.out.println("Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int greater = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = greater;
                }
            }
        }
    }

}

