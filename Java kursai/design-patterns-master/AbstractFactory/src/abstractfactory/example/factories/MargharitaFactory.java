package abstractfactory.example.factories;

import abstractfactory.example.pizza.Pizza;
import abstractfactory.example.pizza.Margharita;

public class MargharitaFactory implements PizzaAbstractFactory {

    @Override
    public Pizza create(int size) {
        return new Margharita(size);
    }
}
