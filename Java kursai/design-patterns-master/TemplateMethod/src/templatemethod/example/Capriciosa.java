package templatemethod.example;

public class Capriciosa extends Pizza {

    @Override
    protected void addIngredients() {
        System.out.println("Capriciosa");
        System.out.println("Add ingredients: Tomato Sauce, Chees, Ham, Mushrooms");
    }

}