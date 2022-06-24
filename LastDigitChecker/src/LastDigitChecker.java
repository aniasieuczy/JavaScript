public class LastDigitChecker {

    public static boolean hasSameLastDigit(int a, int b, int c) {

        int digitA = 0;
        int digitB = 0;
        int digitC = 0;

        digitA = a % 10;
        digitB = b % 10;
        digitC = c % 10;

        if (isValid(a) && isValid(b) && isValid(c)) {
            if ((digitA == digitB) || (digitB == digitC) || (digitA==digitC)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static boolean isValid(int number) {
        if ((number >= 10) && (number <= 1000)) {
            return true;
        } else {
            return false;
        }
    }
}

