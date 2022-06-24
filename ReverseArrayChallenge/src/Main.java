import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 5, 3, 7, 11, 9, 15};
        System.out.println("Array= " + Arrays.toString(array));

        reverse(array);

        System.out.println("Reversed array = " + Arrays.toString(array));

    }

    private static void reverse(int[] array) {

        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for(int i=0; i< halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex - i] = temp;

        }
    }
}


//            int[] reversed = new int[myArray.length];
//            for (int i = 0; i < myArray.length - 1; i++) {
//                reversed[i] = myArray[i];
//                int count = myArray.length;
//                reversed[i] = myArray[count -1];
//
//                int temp;
//
//                while(reversed[i + 1] != reversed [count-1]) {
//                    temp = reversed[i+1];
//                    reversed[i + 1] = reversed[count - 1];
//                    reversed[count-1] = temp;




