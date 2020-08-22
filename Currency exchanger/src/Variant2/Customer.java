package Variant2;

import java.util.Map;
import java.util.TreeMap;

public class Customer {
    private final int availableAmount;
    private TreeMap<Nominals, Integer> getBanknotes;

    public Customer(Integer availableAmount) {
        this.availableAmount = availableAmount;
        this.getBanknotes = new TreeMap<>();
    }

    public Integer getAvailableAmount() {
        return availableAmount;
    }

    public void setGetBanknotes(TreeMap<Nominals, Integer> getBanknotes) {
        this.getBanknotes = getBanknotes;
    }

    public String banknotesAvailableToString() {

        StringBuilder rezult = new StringBuilder();
        int unchangedAmount = availableAmount;
        for (Map.Entry<Nominals, Integer> banknotes : getBanknotes.entrySet()) {
            Nominals nominal = banknotes.getKey();
            int banknoteQuantity = banknotes.getValue();

            if (rezult.length() != 0) {
                rezult.append(" + ");
            }
            rezult.append(banknoteQuantity).append("*").append(nominal.getNominal());
            unchangedAmount -= banknoteQuantity * nominal.getNominal();
        }

        rezult.insert(0, availableAmount + " = ");
        rezult.append(unchangedAmount > 0 ? " + " + unchangedAmount + "(unchanged)" : "");

        return rezult.toString();
    }

}
