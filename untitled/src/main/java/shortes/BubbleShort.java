package shortes;

import java.util.Arrays;

public class BubbleShort {

    public static void main(String[] args) {
        int[] numbers = {8, 5, 6, 1, 4, 3, 7};
        System.out.println("Pradinis masyvas: " + Arrays.toString(numbers));
        System.out.println("Surusiuotas masyvas: " + Arrays.toString(bubbleSort(numbers)));
    }

    private static int[] bubbleSort(int[] numbers) {
        int temp;
        for (int i = 0; i < numbers.length - 1; i++) {
            boolean pakeista = false;
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    pakeista = true;
                }
            }
            if (!pakeista) {
                break;
            }
        }
        return numbers;
    }
}
