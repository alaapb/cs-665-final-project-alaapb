package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import edu.bu.met.cs665.Builders.IngredientBuilder;
import edu.bu.met.cs665.Builders.RecipeBuilder;
import edu.bu.met.cs665.Data.Ingredient;
import edu.bu.met.cs665.Data.Recipe;

/**
 * Name: Alaap Bharadwaj
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/04/2023
 * File Name: TestRecipe.java
 * Description: Tests for the recipe object
 */
public class TestRecipe {
    List<Ingredient> ings = new ArrayList<>();
    List<String> instructions = new ArrayList<>();


    /**
     * Sets the ingredients before a test is ran
     */
    @Before
    public void setIngs() {
        ings.add(new IngredientBuilder()
                    .setName("Milk")
                    .setAmount(2)
                    .setUnit("ml")
                    .build());
        ings.add(new IngredientBuilder()
                    .setName("Sugar")
                    .setAmount(2)
                    .setUnit("tsp")
                    .build());
        ings.add(new IngredientBuilder()
                    .setName("Salt")
                    .setAmount(1)
                    .setUnit("tsps")
                    .build());
    }

    /**
     * Sets the instructions before a test is ran
     */
    @Before
    public void setInst() {
        instructions.add("1. Mix all ingredients together");
        instructions.add("2. Whisk them until cream texture");
        instructions.add("3. Put into container and put into fridge");
    }
    
    /**
     * Checks the recipe name and tests it
     */
    @Test
    public void testRecipeName() {

        Recipe recipe = new RecipeBuilder()
                        .setName("Sponge Cake")
                        .setIngredients(ings)
                        .setInstructions(instructions)
                        .build();

        assertEquals("Sponge Cake", recipe.getName());
    }

    /**
     * Tests for the ingredients and checks if it what is expected
     */
    @Test
    public void testRecipeIngredients() {
        Recipe recipe = new RecipeBuilder()
                        .setName("Sponge Cake")
                        .setIngredients(ings)
                        .setInstructions(instructions)
                        .build();

        assertEquals("Milk", recipe.getIngredients().get(0).getName());
        assertEquals("Sugar", recipe.getIngredients().get(1).getName());
        assertEquals("Salt", recipe.getIngredients().get(2).getName());
    }

}
