import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ArrayList <Integer> points;

    public UserInterface(Scanner scanner) `{
        this.scanner = scanner;
        this.points = new ArrayList<Integer>();
    }`

    public void start() {
        double average = 0;
        int sum = 0;
        int count = 0;
        System.out.println("Enter point totals, -1 stops: ");

        while(true) {
            String numberAsString = scanner.nextLine();
            int numberOfPoints = Integer.valueOf(numberAsString);
            scanner.nextLine();

            if(numberOfPoints > 0 && numberOfPoints < 100) {
                this.points.add(numberOfPoints);
                sum = numberOfPoints + sum;
                count++;
                average = numberOfPoints / count;
            } else if(numberOfPoints == -1) {
                break;

            }

            System.out.println("Point average (all): " + average);
            for(Integer nazwa: points) {
                System.out.println(nazwa);
            }
        }
    }
}