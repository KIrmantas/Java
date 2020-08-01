package com.example;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        long givenAmount = 601;
        List<Nominal> nominalOrder = Arrays.asList(Nominal.FIVE_HUNDRED, Nominal.TWENTY, Nominal.TWO, Nominal.ONE);

        Map<Nominal, Long> nominalQuantities = getExchange(givenAmount, nominalOrder);

        if (nominalQuantities.isEmpty()) {
            System.out.println("It is impossible to fetch given amount with given set of banknotes.\n" +
                    "Given amount: " + givenAmount + '\n' +
                    "Given banknotes: " + nominalOrder);
        }
        
        printNominalQuantities(nominalQuantities);
    }

    private static Map<Nominal, Long> getExchange(long givenAmount, List<Nominal> nominalOrder) {
        List<Handler> nominalHandlers = getChainedNominalHandlers(nominalOrder);
        return getExchange(nominalHandlers, givenAmount);
    }

    private static List<Handler> getChainedNominalHandlers(List<Nominal> nominalOrder) {
        List<Handler> nominalHandlers = createNominalHandlers(nominalOrder);
        chainNominalHandlers(nominalHandlers);
        return nominalHandlers;
    }

    private static Map<Nominal, Long> getExchange(List<Handler> nominalHandlers, long givenAmount) {
        try {
            return nominalHandlers.get(0).fetch(givenAmount);
        } catch (RanOutOfNominalsException e) {
            return new LinkedHashMap<>();
        }
    }

    private static void printNominalQuantities(Map<Nominal, Long> nominalQuantities) {
        System.out.println("Nominal x quantity = nominal total:");
        long totalSum = 0;
        for (Map.Entry<Nominal, Long> nominalQuantity : nominalQuantities.entrySet()) {
            long nominalValue = nominalQuantity.getKey().getValue();
            long nominalQnt = nominalQuantity.getValue();
            long nominalSum = nominalValue * nominalQnt;
            System.out.printf("%7d x %3d = %7d\n", nominalValue, nominalQnt, nominalSum);
            totalSum += nominalSum;
        }
        System.out.println("Total sum: " + totalSum);
    }

    private static void chainNominalHandlers(List<Handler> nominalHandlers) {
        for (int i = 0; i < nominalHandlers.size() - 1; i++) {
            nominalHandlers.get(i).setNextHandler(nominalHandlers.get(i + 1));
        }
    }

    private static List<Handler> createNominalHandlers(List<Nominal> nominalOrder) {
        List<Handler> nominalHandlers = new ArrayList<>();
        for (Nominal nominal : nominalOrder) {
            nominalHandlers.add(new NominalHandler(nominal));
        }
        return nominalHandlers;
    }
}
