package edu.bu.met.cs665.Data;

import java.util.List;

/**
 * Name: Alaap Bharadwaj
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/04/2023
 * File Name: Recipe.java
 * Description: Recipe object to hold information about the recipes
 */
public class Recipe {
    private String name;
    private List<Ingredient> ingredients;
    private List<String> instructions;
    
    public Recipe(String name, List<Ingredient> ingredients, List<String> instructions) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    /**
     * Retrieves name of the recipe
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the ingredients of the recipe
     * @return
     */
    public List<Ingredient> getIngredients() {
        return this.ingredients;
    }

    /**
     * Retrieves the instructions for the recipe
     * @return
     */
    public List<String> getInstructions() {
        return instructions;
    }
}
