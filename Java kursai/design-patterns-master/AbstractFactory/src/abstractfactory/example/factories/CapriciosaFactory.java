package abstractfactory.example.factories;

import abstractfactory.example.pizza.Pizza;
import abstractfactory.example.pizza.Capriciosa;

public class CapriciosaFactory implements PizzaAbstractFactory {

    @Override
    public Pizza create(int size) {
        return new Capriciosa(size);
    }
}
