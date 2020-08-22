package templatemethod.exercise;

public abstract class Sort {

    int[] arr;

    public void sortArray(int sizeArray){
        randomArray(sizeArray);
        System.out.println("Array before:");
        printArray();
        sort();
        System.out.println("Array after:");
        printArray();
        System.out.println("Array is sorted.");
    }

    private void randomArray(int sizeArray){
        arr = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            int n = (int) (Math.random() * 20 + 1);
            arr[i] = n;
        }
    }

    protected abstract void sort();

    private void printArray(){
        int n = arr.length;
        System.out.print("[");
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");
    }
}
