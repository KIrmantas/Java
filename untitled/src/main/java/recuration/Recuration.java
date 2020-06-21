package recuration;

public class Recuration {
    public static void main(String[] args) {
        int n = 10;
        System.out.printf("%d! =  %d", n, factorial(n));

    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
