package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        printPattern(5);
    }


    public static void printPattern(int N) {

        N = 4;
        int min;

        System.out.println("Value of N: " + N);
        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= N; j++) {
                min = i < j ? i : j;
                System.out.print(N - min + 1);
            }
            for (int j = N - 1; j >= 1; j--) {

                min = i < j ? i : j;
                System.out.print(N - min + 1);
            }
            System.out.println("");
        }
        for (int i = N - 1; i >= 1; i--) {
            for (int j = 1; j <= N; j++) {

                min = i < j ? i : j;
                System.out.print(N - min + 1);
            }

            for (int j = N - 1; j >= 1; j--) {
                min = i < j ? i : j;
                System.out.print(N - min + 1);

            }
            System.out.println(" ");
        }
    }
}







