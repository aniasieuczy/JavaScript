public class NumberToWords {

    public static void numberToWords(int number) {

        int reverse = reverse(number);
        int count = getDigitCount(number);

        if (number < 0) {
            System.out.println("Invalid Value");
        }
        while (reverse > 0) {

            int lastDigit;
            lastDigit = reverse % 10;
            reverse = reverse / 10;
            count=count-1;

            switch (lastDigit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                default:
                    System.out.println("Nine");
                    break;
            }
        }
        if (count>0) {
            for (int i = 0; i < count; i++) {
                System.out.println("Zero");
            }
        }
    }

        public static int reverse (int number){


            int lastDigit = 0;
            int reverse = 0;

            while (number != 0) {
                lastDigit = number % 10;
                number = number / 10;
                reverse = lastDigit + (reverse * 10);
            }
            return reverse;
        }


        public static int getDigitCount ( int number){

            int count = 0;
            if (number < 0) {
                return -1;
            } else if (number == 0) {
                return 1;
            } else {
                while (number > 0) {
                    number = number / 10;
                    count++;
                }
            }
            return count;
        }
    }








