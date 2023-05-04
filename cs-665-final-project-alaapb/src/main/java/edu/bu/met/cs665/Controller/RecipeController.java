package edu.bu.met.cs665.Controller;

import java.util.List;

import edu.bu.met.cs665.Data.Recipe;
import edu.bu.met.cs665.Model.Recipes;
import edu.bu.met.cs665.View.RecipeView;

/**
 * Name: Alaap Bharadwaj
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/04/2023
 * File Name: RecipeController.java
 * Description: Controller for the recipes, between the data and the view
 */
public class RecipeController {
    private Recipes recipes;
    private RecipeView recipeView;

    public RecipeController(Recipes recipes, RecipeView recipeView) {
        this.recipeView = recipeView;
        this.recipes = recipes;
    }

    public RecipeController() {
        this.recipes = new Recipes();
        this.recipeView = new RecipeView();
    }

    /**
     * Adds recipe and calls the method in the recipes model to add it to the functions
     * @param recipe
     */
    public void addRecipe(Recipe recipe) {
        recipes.addRecipe(recipe);
        this.updateView();
    }

    /**
     * Updates the view by calling the method in the recipe view
     */
    private void updateView() {
        recipeView.printRecipes(recipes.getRecipes());
    }

    /**
     * Retrieves the recipe list from the recipe model
     * @return
     */
    public List<Recipe> getRecipes() {
        return recipes.getRecipes();
    }

}
