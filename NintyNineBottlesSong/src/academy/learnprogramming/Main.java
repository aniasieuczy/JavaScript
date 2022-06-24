package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	int beerNumber = 99;
	String word = "bottles";

	while (beerNumber > 0) {
	    if(beerNumber == 1) {
	        word = "bottle";
        }
        System.out.println(beerNumber + " " + word + " of the beer on the wall");
        System.out.println(beerNumber + " " + word + " of beer.");
        System.out.println("Pass it around");
        beerNumber = beerNumber - 1;

        }
            System.out.println("No more bottles of beer on the wall");
        }
     }

