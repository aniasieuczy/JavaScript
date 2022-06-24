public class BarkingDog {

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {

        shouldWakeUp(false, 23);
        shouldWakeUp(true, 9);


            if (hourOfDay < 0 || hourOfDay > 23) {
                return false;
            }

            if (isBarking) {
                if ((hourOfDay < 8) || (hourOfDay > 22)) {
                    return true;
                }

            }
            return false;
        }

    }








