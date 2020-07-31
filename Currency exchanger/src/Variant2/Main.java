package Variant2;

public class Main {
    public static void main(String[] args) {
        BanknotesExchange exchanger1 = new BanknotesExchange();
        exchanger1.setExistingBanknotes(500, 1);
        exchanger1.setExistingBanknotes(20, 20);
        exchanger1.setExistingBanknotes(2, 100);

        Customer customer1 = new Customer(1111);

        Exchange exchange1 = new Exchange(exchanger1);

        exchange1.exchangeToBanknotes(customer1);
        System.out.println(customer1.banknotesAvailableToString());

    }
}
