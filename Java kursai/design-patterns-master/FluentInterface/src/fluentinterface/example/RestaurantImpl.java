package fluentinterface.example;

public class RestaurantImpl implements Restaurant {

    String name;

    @Override
    public Restaurant name(String name) {
        this.name = name;
        System.out.println("Enter to Restaurant: " + name);
        return this;
    }

    @Override
    public Menu getMenu() {
        MenuImpl menu = new MenuImpl();
        menu.showMenu(name);
        return menu;
    }

}
