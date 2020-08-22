package fluentinterface.example;

import java.util.ArrayList;
import java.util.List;

public class MenuImpl implements Menu {

    List<Pizza> menuList = new ArrayList<>();
    List<Pizza> selectedList = new ArrayList<>();

    public MenuImpl() {
        Pizza margharita = new Pizza() {
            @Override
            public Pizza getName() {
                System.out.print("1. Margharita ");
                return this;
            }

            @Override
            public Pizza getIngredients() {
                System.out.println("(Tomato Souce, Chees)");
                return this;
            }

            @Override
            public Integer getCost() {
                return 10;
            }
        };

        Pizza capriciosa = new Pizza() {
            @Override
            public Pizza getName() {
                System.out.print("2. Capriciosa ");
                return this;
            }

            @Override
            public Pizza getIngredients() {
                System.out.println("(Tomato Souce, Chees, Ham, Mushrooms)");
                return this;
            }

            @Override
            public Integer getCost() {
                return 15;
            }
        };

        Pizza fruttidimare = new Pizza() {
            @Override
            public Pizza getName() {
                System.out.print("3. Frutti di Mare ");
                return this;
            }

            @Override
            public Pizza getIngredients() {
                System.out.println("(Tomato Souce, Chees, Seafood)");
                return this;
            }

            @Override
            public Integer getCost() {
                return 20;
            }
        };
        menuList.add(margharita);
        menuList.add(capriciosa);
        menuList.add(fruttidimare);
    }

    @Override
    public Menu orderPizza(List<Integer> orders) {
        System.out.println("Order pizza:");
        for (Integer index : orders) {
            Pizza pizza = menuList.get(index - 1);
            selectedList.add(pizza);
            pizza.getName().getIngredients();
        }
        return this;
    }

    @Override
    public Menu eatPizza() {
        System.out.println("Eating: ");
        for (Pizza pizza : selectedList) {
            pizza.getName();
            System.out.println("");
        }
        return this;
    }

    @Override
    public Menu payPizza() {
        int cost = 0;
        for (Pizza pizza : selectedList) {
            cost = cost + pizza.getCost();
        }
        System.out.println("Paying: " + cost + "$");
        return this;
    }

    @Override
    public Pizza getPizza(int index) {
        if (index < 4 && index > 0) {
            return menuList.get(index - 1);
        }
        return null;
    }

    public void showMenu(String name) {
        System.out.println("MENU IN " + name);
        for (Pizza pizza : menuList) {
            pizza.getName().getIngredients();
        }
    }

}
