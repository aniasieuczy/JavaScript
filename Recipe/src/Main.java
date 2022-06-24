import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("File to read: ");

        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        fileName = "recipes";

        ArrayList<Recipe> allRecipes = new ArrayList<>();
        ArrayList<String> ingredients = new ArrayList<>();

        try (Scanner readFile = new Scanner(Paths.get(fileName))) {

            while (readFile.hasNextLine()) {

                String name = readFile.nextLine();
                int time = Integer.valueOf(readFile.nextLine());
                Recipe recipes = new Recipe(name, time);
                allRecipes.add(recipes);

                while (readFile.hasNextLine()) {
                    String ingredient = readFile.nextLine();

                    if (ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        System.out.println("Commands:\n" +
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient\n");


        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("list")) {
                System.out.println("Recipes: ");
                for (Recipe recipe : allRecipes) {
                    System.out.println(recipe);
                }
            }

            if (command.equals("stop")) {
                break;
            }

            if(command.equals("find name")) {
                System.out.print("Searched for: ");
                String searchedFor = scanner.nextLine();
                for(Recipe a: allRecipes){
                    a.containsName(searchedFor);
                }
            }

            if(command.equals("find cooking time")) {
                System.out.print("Max cooking time:");
                int maxCookingTime = Integer.valueOf(scanner.nextLine());
                for(Recipe a: allRecipes) {
                    a.findCookingTime(maxCookingTime);
                }
            }

            if(command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                for(Recipe a: allRecipes) {
                    a.findIngredient(ingredient);
                }
            }


        }
    }
}

