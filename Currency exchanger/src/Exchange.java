public class Exchange {
    private static final int[] NOMINALS = {500, 20, 2};

    public static String changeToNominals(final int exchangeableSum) {
        StringBuilder exchangedNominals = new StringBuilder();
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
        return exchangedNominals.toString();
    }

}
