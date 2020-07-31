package Variant2;

import java.util.TreeMap;

public class Exchange extends BanknotesExchange {

    private final BanknotesExchange exchanger;

    public Exchange(BanknotesExchange exchanger) {
        this.exchanger = exchanger;
    }

    public void exchangeToBanknotes(Customer customer) {

        Integer sum = customer.getAvailableAmount();
        TreeMap<Integer, Integer> existingChangersBanknotes = exchanger.getExistingBanknotes();
        TreeMap<Integer, Integer> getBanknotes = new TreeMap<>();

        for (Integer nominal : existingChangersBanknotes.keySet()) {
            if (existingChangersBanknotes.get(nominal) > 0) {
                Integer quantityObtained = Math.min(existingChangersBanknotes.get(nominal), sum / nominal);
                if (quantityObtained > 0) {
                    getBanknotes.put(nominal, quantityObtained);
                    sum -= quantityObtained * nominal;
                }
            }
        }
        customer.setBanknotesAvailable(getBanknotes);
    }

}
