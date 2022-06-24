import java.util.ArrayList;

public class Recipe {

    private String name;
    private int time;
    private ArrayList<String> ingredients;


    public Recipe(String name, int time) {
        this.name = name;
        this.time = time;
        ArrayList <String> ingredients = new ArrayList<>();
    }

    public boolean containsName (String searchedFor) {
        return this.name.contains(searchedFor);
    }

    public boolean findCookingTime (int maxCookingTime) {
        return this.time <= maxCookingTime;
    }

    public boolean findIngredient (String ingredient){
        return this.ingredients.contains(ingredient);
    }

    public String toString () {
        return this.name + ", cooking time: " + this.time;
    }
}

