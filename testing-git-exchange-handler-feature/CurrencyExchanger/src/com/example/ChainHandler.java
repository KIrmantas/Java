package com.example;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class ChainHandler<Handler> implements Handler {
    Handler nextHandler;

    /**
     * Builds chains of objects
     */
    public void setNextHandler(Handler handler) {
        this.nextHandler = handler;
    }

    /**
     * Subclasses will implement fetch with concrete nominal value close or
     * exact to givenAmount.
     * Subclass will run fetchNext for remaining amount.
     */
    public abstract Map<Nominal, Long> fetch(long givenAmount) throws RanOutOfNominalsException;

    /**
     * Runs fetch on the next object or ends traversing
     */
    public Map<Nominal, Long> fetchNext(long givenAmount) throws RanOutOfNominalsException {
        if (givenAmount == 0) {
            return new LinkedHashMap<>();
        }
        if (nextHandler == null) {
            throw new RanOutOfNominalsException("Not enough banknotes");
        }
        return nextHandler.fetch(givenAmount);
    }
}
