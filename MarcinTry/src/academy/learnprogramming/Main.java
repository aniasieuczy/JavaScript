package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println (getDurationString(125, 30));
    }

    public static String getDurationString (int minutes, int seconds) {

        if ((minutes < 0) || (seconds < 0) || (seconds > 60)) {
          return ("Invalid value");
        } else {
            int minutesRemainder = minutes % 60;
            int hours = minutes / 60;
            minutes = minutesRemainder;
            //System.out.println(hours + " hour " + minutes + " minutes " + seconds + " seconds");
            String result = (hours + " hour " + minutes + " minutes " + seconds + " seconds");
            return result;
        }
    }
}
