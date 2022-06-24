import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("File to read: ");

        Scanner scanner = new Scanner (System.in);
        String fileName = scanner.nextLine();
        fileName = "recipes";

        ArrayList <Recipe> allRecipes = new ArrayList<>();
        ArrayList <String> ingredients = new ArrayList<>();

        try (Scanner readFile = new Scanner (Paths.get(fileName))) {

            while(readFile.hasNextLine()) {

                String name = readFile.nextLine();
                int time = Integer.valueOf(readFile.nextLine());
                Recipe recipes = new Recipe (name, time);
                allRecipes.add(recipes);

                    while(readFile.hasNextLine()) {
                        String ingredient = readFile.nextLine();

                        if(ingredient.isEmpty()) {
                            break;
                        }
                        ingredients.add(ingredient);

                    }


            }


        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }
}
