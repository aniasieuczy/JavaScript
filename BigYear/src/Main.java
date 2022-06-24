import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList <BirdWatchers> birds = new ArrayList<>();

        while (true) {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Add")) {

                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Latin name: ");
                String latinName = scanner.nextLine();

                birds.add(new BirdWatchers(name, latinName));
            }

            if (command.equals("observations")) {
                System.out.print("Bird? ");
                String name = scanner.nextLine();
                boolean exists = false;

                for(BirdWatchers birdWatchers: birds) {
                    if (birdWatchers.containsName(name)) {
                        birdWatchers.addObservation();
                        exists = true;
                    }
                }
                if( exists = false) {
                    System.out.println("Not a bird");
                }
            }


            if (command.equals("All")) {
                for(BirdWatchers birdWatchers: birds) {
                    System.out.println(birdWatchers);
                }
            }

            if (command.equals("One")) {
                System.out.print("Bird? ");
                String bird = scanner.nextLine();
                for(BirdWatchers birdWatchers: birds) {
                    if(birdWatchers.containsName(bird)) {
                        System.out.println(birdWatchers.toString());
                    }
                }
            }

            if (command.equals("Quit")) {
                break;
            }

        }
    }
}
