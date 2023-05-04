package edu.bu.met.cs665.Builders;

import java.util.List;

import edu.bu.met.cs665.Data.Ingredient;
import edu.bu.met.cs665.Data.Recipe;

/**
 * Name: Alaap Bharadwaj
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/04/2023
 * File Name: RecipeBuilder.java
 * Description: RecipeBuilder helps build the recipes and return the recipe object
 */
public class RecipeBuilder implements Builder {
    private String name;
    private List<Ingredient> ingredients;
    private List<String> instructions;

    /**
     * Sets the name attribute
     * @param name
     * @return
     */
    public RecipeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Sets the ingredients attribute
     * @param ingredients
     * @return
     */
    public RecipeBuilder setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    /**
     * Sets the instructions attribute
     * @param instructions
     * @return
     */
    public RecipeBuilder setInstructions(List<String> instructions) {
        this.instructions = instructions;
        return this;
    }

    /**
     * Creates the recipe object and returns it
     * @return
     */
    public Recipe build() {
        return new Recipe(this.name, this.ingredients, this.instructions);
    }
}
