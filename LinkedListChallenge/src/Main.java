import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Stormbringer", "Deep Purple");

        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);

        albums.add(album);

        album = new Album ("For those about to rock", "AC/DC");

        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);




//        boolean quit = false;
//        printActions();
////        quitPlaylist();
////        printSongs();
//        addNewSong();
//        skipSong();
//        forwardToTheNextSong();
//        skipBacwardsPreviousSong();
//        replay();


//        while (!quit) {
//            System.out.println("Enter action (1  to show available action):");
//
//            int action = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (action) {
//                case 0:
//                    System.out.println("\nquit");
//                    quit = true;
//                    break;
//                case 1:
//                    printActions();
//                    break;
//                case 2:
//                    album.printSongs("list of albums");
//                    break;
//                case 3:
//                    addNewSong();
//                    break;
////                case 4:
////                    skipSong();
////                    break;
////                case 5:
////                    forwardToTheNextSong();
////                    break;
////                case 6:
////                    skipBackwardsPreviousSong();
////                    break;
////                case 7:
////                    replay();
////                    break;
//            }
//        }
//    }

    private static void addNewSong() {
        System.out.println("Enter new title");
        String title = scanner.nextLine();
        System.out.println("Type duration of song: ");
        double duration = scanner.nextDouble();
        scanner.nextLine();
        Song newSong = Song.addSong(title, duration);

        if (album.addSong(Song.addSong(title, duration))) {
            System.out.println("New song addded");
        } else {
            System.out.println("Cannot add, " + title + "already on file");
        }
    }

        private static void printActions() {
            System.out.println("\nAvailable actions: \n press");
            System.out.println("0 - to quit playlist\n" +
                    "1 - to print instructions\n" +
                    "2 - to print albums\n" +
                    "3 - to add a new song to album\n" +
                    "4 - to skip song\n" +
                    "5 - to play the next song\n" +
                    "6 - to play the previous song\n" +
                    "7 - to replay the song\n");
        }
    }
}
