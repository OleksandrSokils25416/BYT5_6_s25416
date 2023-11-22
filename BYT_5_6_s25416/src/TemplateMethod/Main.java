package TemplateMethod;

public class Main {
    public static void main(String[] args) {
        Recipe spaghettiBolognese = new SpaghettiBologneseRecipe();
        Recipe pancake = new PancakeRecipe();

        System.out.println("Making Spaghetti Bolognese:");
        spaghettiBolognese.cook();

        System.out.println("\nMaking Pancakes:");
        pancake.cook();
    }
}
