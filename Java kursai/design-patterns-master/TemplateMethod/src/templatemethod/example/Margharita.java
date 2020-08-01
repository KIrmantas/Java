package templatemethod.example;

public class Margharita extends Pizza {

    @Override
    protected void addIngredients() {
        System.out.println("Margharita");
        System.out.println("Add ingredients: Tomato Sauce, Chees");
    }

}