import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
//        System.out.println("How many books to create?");
//        int numberOfBooks = Integer.valueOf(scanner.nextLine());
//
//        for (int i = 0; i < numberOfBooks; i++) {
//            System.out.println("Name of " + (i +1) + " book?");
//            String name = scanner.nextLine();
//
//            System.out.println("Id of " + name + " book?");
//            int id = Integer.valueOf(scanner.nextLine());
//
//            books.add(new Book(id, name));
//        }

        books.add(new Book(5, "wiedzmin"));
        books.add(new Book(122, "Nakrecana dziewczyna"));
        books.add(new Book(222, "Umarly las"));
        books.add(new Book(322, "Pod ziemia"));
        books.add(new Book(422, "NPod woda"));
        books.add(new Book(522, "Albert Albertson"));


        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
         int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }


    public static int linearSearch(ArrayList<Book> books, int searchedId) {

        int value;
        int x = 0;
        for (int i = 0; i < books.size(); i++) {
            value = books.get(i).getId();
            if (value == searchedId) {
                x = i;
                break;
            } else {
                x = -1;
            }
        }
        return x;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {

        int beginning = 0;
        int end = books.size() - 1;
        int x = 0;
//        for(int i = beginning; i < end; i++) {

        while (beginning <= end) {

            int middle = (beginning + end) / 2;

                  if (books.get(middle).getId() == searchedId) {
                x= middle;
                return x;
            } else if (books.get(middle).getId() > searchedId) {
                end = middle - 1;
            } else if (books.get(middle).getId() < searchedId) {
                      beginning = middle + 1;
                  }
        }
        return -1;
    }
}



