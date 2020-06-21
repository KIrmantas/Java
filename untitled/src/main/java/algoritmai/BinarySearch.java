package algoritmai;

// Dvejetaine paieska
public class BinarySearch {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int left = 0;
        int right = numbers.length - 1;

        int value = 70;
        int middleIndex;
        boolean found = false;

        while (left <= right && !found) {
            middleIndex = (left + right) / 2;
            if (value == numbers[middleIndex]) {
                found = true;
                System.out.printf("Rasta reiksmes %d pozicija yra %d", value, middleIndex);
            } else {
                if (value < numbers[middleIndex]) {
                    right = middleIndex - 1;
                } else {
                    left = middleIndex + 1;
                }
            }


        }

    }
}
