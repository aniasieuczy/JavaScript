package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;

//        while (true) {
        while (count < 10) {
            int order = count + 1;
            System.out.println("Enter number # " + order + ":");

            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int userNumber = scanner.nextInt();
                count++;
                sum = userNumber + sum;
//                if(count == 10) {
//                    break;
//                }
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine();
        }

        System.out.println("sum = " + sum);
        scanner.close();
    }
}





