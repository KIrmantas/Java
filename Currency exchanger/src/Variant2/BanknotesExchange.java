package Variant2;

import java.util.TreeMap;

public class BanknotesExchange {
    private final TreeMap<Nominals, Integer> availableBanknotes = new TreeMap<>();

    public void setExistingBanknotes(Nominals nominal, Integer quantity) {
        availableBanknotes.put(nominal, quantity);
    }

    public TreeMap<Nominals, Integer> getAvailableBanknotes() {
        return availableBanknotes;
    }
}
