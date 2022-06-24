package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        StringBuilder courseName = new StringBuilder("Learn C# for Beginners Crash Course");

        int position = -1;

        do {
            position = courseName.toString().toLowerCase().indexOf(" c", position + 1);

            if (position != -1) {
                replaceByIndex(courseName, position, " c".length(), " Java");
                System.out.println(courseName);
            }
        } while (position != -1);
        String fixedString = courseName.toString().replace(" Java", " c");
        System.out.println(fixedString);

    }

    private static String replaceByIndex(String original, int start, int lenght, String replacement) {
        String toRemove = original.substring(start, start + lenght);
        return original.replaceFirst(toRemove, replacement);
    }

    private static StringBuilder replaceByIndex(StringBuilder original, int start, int lenght, String replacement) {
        return original.replace(start, start + lenght, replacement);
    }


}
