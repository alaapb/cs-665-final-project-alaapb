package edu.bu.met.cs665.Builders;

import edu.bu.met.cs665.Data.Ingredient;

/**
 * Name: Alaap Bharadwaj
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/04/2023
 * File Name: IngredientBuilder.java
 * Description: Ingredient builder helps build the ingredient objects using the builder interface
 */
public class IngredientBuilder implements Builder {
    private String name;
    private int amount;
    private String unit;

    /**
     * Sets the name attribute
     * @param name
     * @return
     */
    public IngredientBuilder setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Sets the amount attribute
     * @param amount
     * @return
     */
    public IngredientBuilder setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Sets the unit attribute
     * @param unit
     * @return
     */
    public IngredientBuilder setUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * Creates the ingredient object and returns it
     * @return
     */
    public Ingredient build() {
        return new Ingredient(name, amount, unit);
    }
}
