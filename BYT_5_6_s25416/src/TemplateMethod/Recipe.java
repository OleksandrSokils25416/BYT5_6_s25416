package TemplateMethod;

public abstract class Recipe {
    public final void cook() {
        prepareIngredients();
        cookIngredients();
        serve();
    }

    protected abstract void prepareIngredients();

    protected abstract void cookIngredients();

    protected void serve() {
        System.out.println("Serve the dish");
    }
}
