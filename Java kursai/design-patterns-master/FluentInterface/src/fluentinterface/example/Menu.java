package FluentInterface.src.fluentinterface.example;

import java.util.List;

public interface Menu {

    public Menu orderPizza(List<Integer> orders);

    public Menu eatPizza();

    public Menu payPizza();

    public fluentinterface.example.Pizza getPizza(int index);
}
