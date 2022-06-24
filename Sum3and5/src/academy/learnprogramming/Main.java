package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("Number " + i + " divides by 3 and 5");
                count++;
                sum=sum+i;
            } else if (count == 5) {
                System.out.println("Found 5 numbers that divides by both 3 and 5. Exiting the loop");
                break;
            }
            }
        System.out.println("Sum of 5 numbers that divides by both 3 and 5 is " + sum);
        }
    }



