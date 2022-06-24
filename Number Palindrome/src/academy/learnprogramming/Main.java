package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(11212));

    }

    public static boolean isPalindrome(int number) {
        int startingNumber = number;
        int lastDigit = 0;
        int reverse = 0;

        while (number != 0) {
            lastDigit = number % 10;
            reverse = lastDigit + (reverse * 10);
            number = (number / 10);
        }
        if(startingNumber == reverse) {
            System.out.println("Number " + reverse + " is a palindrome number");
            return true;
        } else {
            System.out.println("Number is not a palindrome number");
            return false;
        }
    }
}
