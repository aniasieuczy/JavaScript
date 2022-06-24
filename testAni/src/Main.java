import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        UserInterface userInterface = new UserInterface(scanner);
        System.out.println(userInterface.gettingPoints());

        System.out.println("");

        Statistics statistics = new Statistics();

        statistics.averageOfAll(userInterface.getListOfPoints());
        statistics.averageOfPassing((userInterface.getListOfPoints()));
        statistics.passPercentage(userInterface.getListOfPoints(), statistics.getListOfPassing());

        Grades grades = new Grades();
        grades.gradeDistribution(userInterface.getListOfPoints());
        System.out.println(grades.getGrades().toString());
        grades.printGradesAsStars(grades.getGrades());

        // Write your program here -- consider breaking the program into
        // multiple classes.
    }
}
