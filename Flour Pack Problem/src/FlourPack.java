public class FlourPack {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int sum = (5 * bigCount) + smallCount;

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        } else if  (sum >= goal) {
            if (smallCount >= (goal % 5))
            return true;
        }
        return false;
    }

}


