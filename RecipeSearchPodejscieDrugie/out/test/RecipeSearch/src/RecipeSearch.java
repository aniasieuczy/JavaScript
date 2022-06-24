//import java.util.Scanner;
//
//public class RecipeSearch {
//
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        Reader reader = new Reader(scanner);
//
//        String input = reader.readFile();
//        input = "recipes";
//
//        reader.getLines(input);
//        reader.convertLinesToRecipesList(reader.getLines());
//
//        while(true) {
//
//            System.out.print("Enter command: ");
//            String command = scanner.nextLine();
//            command = "list";
//
//            if(command.equals("list")) {
//                reader.printAllRecipes();
//            } else if(command.equals("stop")) {
//                break;
//            } else if (command.equals("find name")) {
//                reader.findName(reader.getAllRecipes());
//            } else if (command.equals("find cooking time")) {
//                reader.findCookingTime(reader.getAllRecipes());
//            } else if(command.equals("find ingredient")) {
//                reader.findIngredient(reader.getAllRecipes());
//
//
//
//            }
//
//            }
//
////
//
//
//
//    }
//}
