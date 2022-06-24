import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DiagonalSpa {

    public static void printSquareStar(int number) {
        int N = number;
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {

                    if ((i == 1) || (j == 1) || (i == j) || (i == N) || (j == N) || (i + j == N + 1)) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");

            }
        }
    }
}





