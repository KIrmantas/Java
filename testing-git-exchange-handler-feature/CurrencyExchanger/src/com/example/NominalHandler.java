package com.example;

import java.util.Map;

public class NominalHandler<Nominal> extends ChainHandler {
    Nominal nominal;

    public NominalHandler(Nominal nominal) {
        this.nominal = nominal;
    }

    @Override
    public void setNextHandler(Handler handler) {
        super.setNextHandler(handler);
    }

    public Map<Nominal, Long> fetch(long givenAmount) throws RanOutOfNominalsException {
        long banknoteValue = this.nominal.getValue();
        long numberOfBanknotes = givenAmount / banknoteValue;
        long pendingAmount = givenAmount % banknoteValue;
        Map<Nominal, Long> result = super.fetchNext(pendingAmount);
        if (numberOfBanknotes > 0) {
            result.put(this.nominal, numberOfBanknotes);
        }
        return result;
    }
}
