public class MinutesToYearsAndDaysCalculator {

    public static void printYearsAndDays (long minutes) {
        if(minutes < 0) {
            System.out.print("Invalid Value");
        } else {
            long hour = minutes / 60;
            long days = hour / 24;
            long years = days / 365;
            long daysRemainder = days % 365;
            System.out.print(minutes + " min = " + years + " y and " + daysRemainder + " d");
        }
    }

}
