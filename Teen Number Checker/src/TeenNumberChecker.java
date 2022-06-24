public class TeenNumberChecker {

    public static boolean hasTeen (int firstParameter, int secondParameter, int thirdParameter) {

        if((isTeen(firstParameter) || isTeen(secondParameter) || isTeen(thirdParameter))) {
            return true;
        } else {
            return false;
            }
    }


    public static boolean isTeen(int i) {

        if (i >= 13 && i <=19) {
            return true;
        } else {
            return false;
        }

    }

}

