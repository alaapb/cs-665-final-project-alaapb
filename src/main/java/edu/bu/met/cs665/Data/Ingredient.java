package edu.bu.met.cs665.Data;

/**
 * Name: Alaap Bharadwaj
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/04/2023
 * File Name: Ingredient.java
 * Description: Ingredient object that is used in the recipe as well
 */
public class Ingredient {
    private String name;
    private int amount;
    private String unit;

    public Ingredient(String name, int amount, String unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }

    /**
     * Retrieves name of the ingredient
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the name of the ingredient
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the amount for the ingredient
     * @return
     */
    public int getAmount() {
        return this.amount;
    }

    /**
     * Sets the amount of the ingredient
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Retrieves the unit for the ingredient
     * @return
     */
    public String getUnit() {
        return this.unit;
    }

    /**
     * Sets the unit of the ingredient
     * @param unit
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }
}
