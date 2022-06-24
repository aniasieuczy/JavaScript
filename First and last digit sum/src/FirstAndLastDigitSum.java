public class FirstAndLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {

        int firstDigit = 0;
        int lastDigit = 0;

        if (number < 0) {
            return -1;
        } else if (number <= 9){
            return number + number;
        } else {
            lastDigit = number % 10;

            while (number > 9) {
                number = number / 10;
                firstDigit = number % 10;
                }
            }
        int sum = firstDigit + lastDigit;
        return sum;
        }
    }



