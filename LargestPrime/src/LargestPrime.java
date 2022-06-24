public class LargestPrime {

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        } else {

            for (int i = number - 1; i > 1; i--) {
                boolean isPrime = true;
                for (int j = 2; j < i - 1; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                    }
                }
                if (number % i == 0 && isPrime == true) {
                    return i;
                }
            }

        }
        return number;
    }
}












