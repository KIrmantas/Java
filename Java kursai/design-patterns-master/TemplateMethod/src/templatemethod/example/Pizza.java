package templatemethod.example;

public abstract class Pizza {

    public final void bakingPizza() {
        formingDough();
        addIngredients();
        bakingDough();
        System.out.println("Pizza is baked.");
    }

    private void formingDough(){
        System.out.println("Forming dough");
    }

    protected abstract void addIngredients();

    private void bakingDough(){
        System.out.println("Baking dough");
    }
}