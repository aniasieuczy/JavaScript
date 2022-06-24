import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




        Scanner scanner = new Scanner (System.in);

        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        ArrayList <Recipes> allRecipes = new ArrayList<>();

        try (Scanner fileReader = new Scanner (Paths.get(fileName))) {

            while (fileReader.hasNextLine()) {
                String name = scanner.nextLine();
                int time = Integer.valueOf(scanner.nextLine());
                Recipes recipes = new Recipes(name, time);

                while(scanner.hasNextLine()) {
                    String ingredient = scanner.nextLine();
                    ArrayList <String> ingredients = new ArrayList<>();

                    if(ingredient.isEmpty()) {
                        break;
                    }
                    ingredients.add(ingredient);
                }
                allRecipes.add(recipes);

            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());;
        }
    }

}
