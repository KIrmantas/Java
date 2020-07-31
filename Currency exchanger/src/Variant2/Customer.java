package Variant2;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Customer {
    private final int availableAmount;
    private TreeMap<Integer, Integer> banknotesAvailable;

    public Customer(Integer availableAmount) {
        this.availableAmount = availableAmount;
        this.banknotesAvailable = new TreeMap<>(Collections.reverseOrder());
    }

    public Integer getAvailableAmount() {
        return availableAmount;
    }

    public void setBanknotesAvailable(TreeMap<Integer, Integer> banknotesAvailable) {
        this.banknotesAvailable = banknotesAvailable;
    }

    public String banknotesAvailableToString() {

        StringBuilder rezult = new StringBuilder();
        int unchangedAmount = availableAmount;
        for (Map.Entry<Integer, Integer> nominal : banknotesAvailable.entrySet()) {
            int banknote = nominal.getKey();
            int banknoteQuantity = nominal.getValue();

            if (rezult.length() != 0) {
                rezult.append(" + ");
            }
            rezult.append(banknoteQuantity).append("*").append(banknote);
            unchangedAmount -= banknoteQuantity * banknote;
        }

        rezult.insert(0, availableAmount + " = ");

        rezult.append(unchangedAmount > 0 ? " + " + unchangedAmount + "(unchanged)" : "");

        return rezult.toString();
    }

}
