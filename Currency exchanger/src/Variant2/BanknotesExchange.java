package Variant2;

import java.util.Collections;
import java.util.TreeMap;

public class BanknotesExchange {
    private final TreeMap<Integer, Integer> existingBanknotes = new TreeMap<>(Collections.reverseOrder());

    public void setExistingBanknotes(Integer banknote, Integer quantity) {
        existingBanknotes.put(banknote, quantity);
    }

    public TreeMap<Integer, Integer> getExistingBanknotes() {
        return existingBanknotes;
    }
}
