import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        int[] numbers = {-1, 6, 9, 8, 12};
//        System.out.println(Main.indexOfSmallestFrom(numbers, 0));
//        System.out.println(Main.indexOfSmallestFrom(numbers, 1));
//        System.out.println(Main.indexOfSmallestFrom(numbers, 2));

        int[] numbers2 = {4, 7, 1};

        System.out.println(Arrays.toString(numbers2));

        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2));


        int[] array = {3, 1, 5, 99, 3, 12};

        String[] nazwa = {"a", "t", "n"};

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(85);
        numbers.add(8);

        ArrayList<String> imiona = new ArrayList<>();
        imiona.add("Ania");
        imiona.add("Tymon");
        imiona.add("Nikos");

        Collections.sort(imiona);
        System.out.println(imiona);

    }
}
//
//    Arrays.sort(array);
//    System.out.println(Arrays.toString(array));
//
//    Arrays.sort(nazwa);
//    System.out.println(Arrays.toString(array));
//
//    Collections.sort(numbers);
//    System.out.println(numbers);
//
//    Collections.sort(imiona);
//    System.out.println(imiona);
//
//}
//
//
//    }
//
//    public static void swap (int[]array, int index1, int index2) {
//
//            int temp = array[index1];
//            array[index1] = array[index2];
//            array[index2] = temp;
////        }

//    }
//
//    public static void sort(int[] array) {
//
//        int index = 0;
//        int smallest = Integer.MAX_VALUE;
//
//        boolean flag = true;
//        int temp;
//
//        while (flag) {
//
//            flag = false;
//
//            for (int i = 0; i < array.length - 1; i++) {
//
//                if (array [i] < array[i +1]) {
//
//                    temp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = temp;
//                    flag = true;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(array));
//        }
//    }








//    public static int indexOfSmallestFrom(int[] array, int startIndex) {
//        int index = 0;
//        int smallest = Integer.MAX_VALUE;
//
//        for (int i = startIndex; i < array.length; i++) {
//            int value = array[i];
//
//            if (value < smallest) {
//                smallest = value;
//                index = i;
//            }
//        }
//        return index;
//    }
//
//}



//        int[] myIntegers = getIntegers(5);
//
//        int[]sorted = sortIntegers(myIntegers);
//        printArray(sorted);
//
//    }
//
//
//        public static int[] getIntegers (int capacity) {
//            int[]array = new int [capacity];
//            System.out.println("Enter " + capacity + ", integer value.\r");
//
//            for(int i = 0; i<array.length ; i++) {
//                array[i] = scanner.nextInt();
//            }
//            return array;
//            }
//
//
//            public static void printArray (int[]array) {
//                for (int i = 0; i < array.length; i++) {
//                    System.out.println("Element " + i + " contents " + array[i]);
//                }
//            }
//
//
//            public static int[] sortIntegers (int[]array) {
//                int[] sortedArray = new int[array.length];
//                for (int i = 0; i < array.length; i++) {
//                    sortedArray[i] = array[i];
//                }
//                boolean flag = true;
//                int temp;
//                while (flag) {
//                    flag = false;
//                    for (int i = 0; i < sortedArray.length-1; i++) {
//                        if (sortedArray[i] < sortedArray[i + 1]) {
//                        temp = sortedArray[i];
//                        sortedArray[i] = sortedArray[i + 1];
//                        sortedArray[i + 1] = temp;
//                        flag = true;
//                    }
//                }
//            }
//            return sortedArray;
//
//            }
//        }







