package academy.learnprogramming;

import java.util.ArrayList;

public class Recipes {

    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipes(String name, int time, ArrayList <String> ingredients) {
        this.name = name;
        this.time = time;
        this.ingredients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public ArrayList<String> getIngredients() {
        return new ArrayList <String> (this.ingredients);
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: "+ this.time;

    }

}

