package com.example;

import java.util.Map;

public interface Handler {
    void setNextHandler(Handler handler);

    Map<Nominal, Long> fetch(long givenAmount) throws RanOutOfNominalsException;
}
