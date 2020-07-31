import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Exchangeable sum: ");
        int exchangeableSum = sc.nextInt();

        Exchange exchange = new Exchange();
        String exchangedNominals = exchange.changeToNominals(exchangeableSum);

        System.out.println(exchangeableSum + " = " + exchangedNominals);

    }
}
