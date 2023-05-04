package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.Builders.IngredientBuilder;
import edu.bu.met.cs665.Data.Ingredient;

/**
 * Name: Alaap Bharadwaj
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/04/2023
 * File Name: TestIngredient.java
 * Description: Tests for the ingredient object
 */
public class TestIngredient {
    
    /**
     * Tests the creation of the ingredient object and see if it initializes correctly
     */
    @Test
    public void testIngredientCreation() {
        Ingredient ingredient = new IngredientBuilder()
                                .setName("Milk")
                                .setAmount(2)
                                .setUnit("ml")
                                .build();

        assertEquals("Milk", ingredient.getName());
        assertEquals("ml", ingredient.getUnit());
        assertEquals((int) 2, ingredient.getAmount());
    }

    /**
     * Tests whether the ingredient can be updates or not
     */
    @Test
    public void testIngredientUpdate() {
        Ingredient ingredient = new IngredientBuilder()
                                .setName("Milk")
                                .setAmount(2)
                                .setUnit("ml")
                                .build();

        ingredient.setAmount(5);
        ingredient.setUnit("oz");

        assertEquals("oz", ingredient.getUnit());
        assertEquals((int) 5, ingredient.getAmount());
    }
}
