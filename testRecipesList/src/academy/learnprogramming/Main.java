package academy.learnprogramming;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList <String> ingredients = new ArrayList<>();
        ingredients.add("milk");
        ingredients.add("egg");
        ingredients.add("flour");
        ingredients.add("sugar");
        ingredients.add("salt");
        ingredients.add("butter");



    Recipes recipe = new Recipes("Pancake dough",60, ingredients);
    recipe.setIngredients(ingredients);
        System.out.println(recipe.getIngredients());
        System.out.println(recipe);

	// write your code here
    }
}
