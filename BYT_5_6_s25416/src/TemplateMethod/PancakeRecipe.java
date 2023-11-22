package TemplateMethod;

public class PancakeRecipe extends Recipe {
    @Override
    protected void prepareIngredients() {
        System.out.println("Prepare flour, eggs, milk, and baking powder.");
    }

    @Override
    protected void cookIngredients() {
        System.out.println("Mix the ingredients and cook the pancakes on a griddle.");
    }

    @Override
    protected void serve() {
        System.out.println("Serve the pancakes with syrup or toppings of your choice.");
    }
}