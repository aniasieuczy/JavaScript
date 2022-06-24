public class AllFacots {

    public static void printFactors (int number) {

        if (number < 1) {
            System.out.println("Invalid Value");
        }
        for(int i = 1; i < number; i++) {
            int divider = number / i;
            if(i % 2 == 0) {
                System.out.println(divider);
            }
        }

    }


}
