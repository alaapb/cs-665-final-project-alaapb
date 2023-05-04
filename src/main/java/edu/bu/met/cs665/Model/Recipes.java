package edu.bu.met.cs665.Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import edu.bu.met.cs665.Data.Recipe;

/**
 * Name: Alaap Bharadwaj
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/04/2023
 * File Name: Recipes.java
 * Description: Recipes model to hold the list of recipes for the user
 */
public class Recipes {
    private List<Recipe> recipes;

    public Recipes() {
        recipes = new ArrayList<>();
    }

    /**
     * Adds recipe to the list
     * @param recipe
     */
    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    /**
     * Retrieves an unmodifiable list of the recipes and returns it
     * @return
     */
    public List<Recipe> getRecipes() {
        return Collections.unmodifiableList(recipes);
    }
    
}
