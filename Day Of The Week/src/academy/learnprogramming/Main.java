package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        printDayOfWeek(-1);
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);
    }

        private static void printDayOfWeek(int day) {
        if(day == 0) {
            System.out.println("Sunday");
        } else if(day == 1) {
            System.out.println("Monday");
        } else if(day == 2) {
            System.out.println("Tuesday");
        } else if (day ==3) {
             System.out.println("Wednesday");
        } else if (day == 4) {
              System.out.println("Thursday");
        } else if (day == 5) {
              System.out.println("Friday");
        } else if (day == 6) {
               System.out.println("Saturday");
        } else {
                System.out.println("Invalid value");
            }
        }
//            switch (day) {
//                case 0:
//                    System.out.println("Sunday");
//                    break;
//                case 1:
//                    System.out.println("Monday");
//                    break;
//                case 2:
//                    System.out.println("Tuesday");
//                    break;
//                case 3:
//                    System.out.println("Wednesay");
//                    break;
//                case 4:
//                    System.out.println("Thursday");
//                    break;
//                case 5:
//                    System.out.println("Friday");
//                    break;
//                case 6:
//                    System.out.println("Saturday");
//                    break;
//                default:
//                    System.out.println("Invalid day");
//                    }
            }




