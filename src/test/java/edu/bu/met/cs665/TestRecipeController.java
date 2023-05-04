package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import edu.bu.met.cs665.Builders.IngredientBuilder;
import edu.bu.met.cs665.Builders.RecipeBuilder;
import edu.bu.met.cs665.Controller.RecipeController;
import edu.bu.met.cs665.Data.Ingredient;
import edu.bu.met.cs665.Data.Recipe;

/**
 * Name: Alaap Bharadwaj
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/04/2023
 * File Name: TestRecipeController.java
 * Description: Tests the recipe controller class
 */
public class TestRecipeController {
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
     * Checks if recipe is successfully added to the list of recipes
     */
    @Test
    public void testRecipeControllerAddRecipe() {
        Recipe recipe = new RecipeBuilder()
                        .setName("Sponge Cake")
                        .setIngredients(ings)
                        .setInstructions(instructions)
                        .build();

        RecipeController recipeController = new RecipeController();

        recipeController.addRecipe(recipe);

        assertEquals(true, recipeController.getRecipes().contains(recipe));
    }
}
