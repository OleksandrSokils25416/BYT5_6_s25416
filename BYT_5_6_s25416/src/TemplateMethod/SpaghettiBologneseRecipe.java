package TemplateMethod;

public class SpaghettiBologneseRecipe extends Recipe {
    @Override
    protected void prepareIngredients() {
        System.out.println("Prepare spaghetti, ground beef, onions, tomatoes, garlic, and herbs.");
    }

    @Override
    protected void cookIngredients() {
        System.out.println("Cook the ground beef with onions, garlic, and tomatoes. Add herbs and let it simmer.");
    }
}