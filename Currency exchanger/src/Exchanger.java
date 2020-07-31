import java.util.Scanner;
/*
You're in charge of developing currency exchanger in a special way.
There is a significant extra amount of 500, 20 and 2 nominal values
therefore the strategy is to first use those nominals and only then what is left
(for example 601 = 500 + 20 x5 +1; 999 = 500 + 20 x 29 + 2 £ 9 + 1) Design such a system
 */
public class Exchanger {

    private static final int[] NOMINALS = {500, 20, 2};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Exchangeable amount: ");
        int exchangeableSum = sc.nextInt();

        StringBuilder exchangedNominals = exchange(exchangeableSum);

        System.out.println(exchangeableSum + " = " + exchangedNominals);
    }

    private static StringBuilder exchange(final int exchangeableSum) {
        StringBuilder exchangedNominals = new StringBuilder("");
        int exchangeableAmount = exchangeableSum;

        for (int nominal : NOMINALS) {
            int nominalQuantity = exchangeableAmount / nominal;

            if (nominalQuantity > 0) {
                if (exchangedNominals.length() != 0) {
                    exchangedNominals.append(" + ");
                }
                exchangedNominals.append(nominal)
                        .append("x")
                        .append(nominalQuantity);
            }
            exchangeableAmount = exchangeableAmount % nominal;
        }

        if (exchangeableAmount > 0) {
            exchangedNominals.append(" + ").append(exchangeableAmount);
        }
        return exchangedNominals;
    }

}
