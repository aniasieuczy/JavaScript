public class SharedDigit {

    public static boolean hasSharedDigit(int a, int b) {

        if ((a < 10) || (a > 99) || (b < 10) || (b > 99)) {
            return false;
        } else {
            int firstDigitA = 0;
            int firstDigitB = 0;

            firstDigitA = a % 10;
            a = a / 10;
            firstDigitB = b % 10;
            b = b / 10;

               if ((a == b) || (a == firstDigitB) || (firstDigitA == b) || (firstDigitA == firstDigitB)) {
                   return true;
               }
               return false;
            }
    }
}
