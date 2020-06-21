package bir13;

public class Swap {
    public static void main(String[] args) {
        //        Scanner sc = new Scanner(System.in);
        long num1 = 123456; // sc.nextLong();
        long num2 = 9876; // sc.nextLong();
        System.out.printf("1 skaicius: %d\n2 skaicius: %d\n", num1, num2);
        long n1 = ("" + num1).length();
        long decSize = (long) Math.pow(10, n1);
        num2 = num1 + num2 * decSize;
        num1 = num2 / decSize;
        num2 = num2 % decSize;
        System.out.printf("Sukeitus vietomis\n1 skaicius: %d\n2 skaicius: %d\n", num1, num2);

//        num1 = num1 + num2;
//        num2 = num1 - num2;
//        num1 = num1 - num2;

//        num1 = num1 ^ num2;
//        num2 = num1 ^ num2;
//        num1 = num1 ^ num2;
    }
}
