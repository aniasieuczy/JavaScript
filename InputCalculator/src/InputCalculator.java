import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long average = 0;
        int count = 0;

        while (true) {

            boolean isALong = scanner.hasNextLong();
            boolean isAnInt = scanner.hasNextInt();

            if (isALong) {
                int number = scanner.nextInt();
                count++;

                sum = sum + number;
                average = (long)Math.round((double) sum / (double)count);
                scanner.nextLine();
            } else {
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }
        scanner.close();
    }
}

