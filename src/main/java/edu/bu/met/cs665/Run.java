package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.bu.met.cs665.Builders.RecipeBuilder;
import edu.bu.met.cs665.Controller.RecipeController;
import edu.bu.met.cs665.Data.Ingredient;
import edu.bu.met.cs665.Data.Recipe;

/**
 * Name: Alaap Bharadwaj
 * Course: CS-665 Software Designs & Patterns
 * Date: 05/04/2023
 * File Name: Run.java
 * Description: Run is what the client is able to interact with and can see, while everything else in the system is hidden
 */
public class Run {

    private Scanner scanner;
    private RecipeController recipeController;

    public Run() {
        scanner = new Scanner(System.in);
        recipeController = new RecipeController();
    }
    
    /**
     * Begins the app, and welcomes the users with a welcome message
     */
    public void begin() {
        System.out.println("Welcome, please go ahead to create a custom recipe book");
    }

    /**
     * Creates the recipes and adds them to the list by accessing the recipe controller
     */
    public void createRecipes() {
        // have to implement ingredient, and create a list of ingredients so a recipe can be created
        
        System.out.println("Please click enter to create recipes or x to exit");
        String endFlag = scanner.nextLine();

        while(endFlag != "x") {
            List<Ingredient> ings = new ArrayList<>();
            System.out.println("What is the name of this recipe?");
            String recipeName = scanner.nextLine();
            System.out.println("How many ingredients does this recipe consist?");
            int temp = Integer.parseInt(scanner.nextLine());
            for(int i = 0; i < temp; i++) {
                System.out.println("Starting creation of ingredient");
                ings.add(createIngredient());
            }
            Recipe recipe = new RecipeBuilder()
                            .setName(recipeName)
                            .setIngredients(ings)
                            .setInstructions(createInstructions())
                            .build();
            // add recipe to the model recipes
            recipeController.addRecipe(recipe);
            
            System.out.println("Recipe " + recipe.getName() + " has been created and added to the cook book");
        }


    }

    /**
     * Creates the instructions, prompts users to fill out any instructions and then returns it
     * @return
     */
    private List<String> createInstructions() {
        List<String> instructions = new ArrayList<>();

        System.out.println("How many steps are there in this recipe?");
        int temp = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i <= temp; i++) {
            System.out.println("Please input the step and click enter");
            instructions.add(i + ". " + scanner.nextLine());
        }

        return instructions;
    }

    /**
     * Prompts user to input information about the ingredient and then adds it to the recipe
     * @return
     */
    private Ingredient createIngredient() {

        System.out.println("Please enter name for ingredient");
        String name = scanner.nextLine();

        System.out.println("Please enter amount for ingredient");
        int amount = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter unit for ingredient");
        String unit = scanner.nextLine();
        

        return new IngredientBuilder().setAmount(amount).setName(name).setUnit(unit).build()
    }

}
