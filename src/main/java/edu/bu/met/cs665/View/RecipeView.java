package edu.bu.met.cs665.View;

import java.util.Iterator;
import java.util.List;

import edu.bu.met.cs665.Data.Ingredient;
import edu.bu.met.cs665.Data.Recipe;

/**
 * Name: Alaap Bharadwaj
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/04/2023
 * File Name: RecipeView.java
 * Description: View for recipe, prints out all the recipes in the book that have been added
 */
public class RecipeView {

    /**
     * Prints the recipes that are currently in the model Recipes
     * @param recipes
     */
    public void printRecipes(List<Recipe> recipes) {
        for(Iterator iter = recipes.iterator(); iter.hasNext();) {
            Recipe recipe = (Recipe) iter.next();
            System.out.println("Recipe Name: " + recipe.getName());
            System.out.println("Ingredients: ");
            for(Ingredient ing : recipe.getIngredients()) {
                System.out.println(ing.getName() + ", " + ing.getAmount() + " " + ing.getUnit());
            }

            System.out.println("Instructions:");
            for(String inst : recipe.getInstructions()) {
                System.out.println(inst);
            }
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
