package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(125, 30));
        System.out.println(getDurationString(-125, 30));
        System.out.println(getDurationString(75, 78));
        System.out.println(getDurationString(133, 30));
        System.out.println(getDurationString(125));
        System.out.println(getDurationString(75));
        System.out.println(getDurationString(45));

    }

    public static String getDurationString(int minutes, int seconds) {

        if ((minutes < 0) || (seconds < 0) || (seconds > 60)) {
            return "Invalid value";
        } else {
            int minutesRemainder = minutes % 60;
            int hours = minutes / 60;
            minutes = minutesRemainder;
            String hoursString = hours +"hours";
            String result = (hours + " hour " + minutes + " minutes " + seconds + " seconds");
            return result;
        }
    }

    public static String getDurationString(int seconds) {
        if ((seconds <= 0)) {
            return "Invalid value";
        } else if (seconds < 60) {
            String secondsStr = Integer.toString(seconds);
            secondsStr = (secondsStr + " seconds");
            return secondsStr;
        } else {
            int secondsRemainder = seconds % 60;
            int minutes = seconds / 60;
            return getDurationString(minutes, secondsRemainder);
        }
    }
}






