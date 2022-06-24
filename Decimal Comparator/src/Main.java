public class Main {

    public static void main(String[] args) {
    boolean a =  DecimalComparator.areEqualByThreeDecimalPlaces(3.123, 3.123);
        System.out.println(a);

        DecimalComparator.areEqualByThreeDecimalPlaces(3, 3.1);
        DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123);

    }
}
