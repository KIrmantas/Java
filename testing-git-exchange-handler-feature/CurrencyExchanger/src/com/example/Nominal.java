package com.example;

public enum Nominal {
    FIVE_HUNDRED(500, "Five hundred"),
    TWO_HUNDRED(200, "Two hundred"),
    ONE_HUNDRED(100, "Three hundred"),
    FIFTY(50, "Fifty"),
    TWENTY(20, "Twenty"),
    TEN(10, "Ten"),
    FIVE(5, "Five"),
    TWO(2, "Two"),
    ONE(1, "One");

    private long value;
    private String words;

    Nominal(long value, String words) {
        this.value = value;
        this.words = words;
    }

    public long getValue() {
        return value;
    }

    @Override
    public String toString() {
        return words;
    }
}
