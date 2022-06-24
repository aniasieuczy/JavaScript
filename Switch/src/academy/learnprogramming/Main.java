package academy.learnprogramming;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {
	int value = 1;
	if (value == 1) {
        System.out.println("Value was 1");
    } else if (value == 2) {
        System.out.println("Value was 2");
    } else {
        System.out.println("Value was not 1 or 2");
    }
	int switchValue = 3;
	switch(switchValue) {
        case 1:
            System.out.println("Value was 1");
            break;
        case 2:
            System.out.println("Value was 2");
            break;
        default:
            System.out.println("Was not 1 or 2");
            break;
    }



        char charValue = 'D';
        System.out.println(charValue);
        switch(charValue) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Value was C, D OR E");
                break;
            default:
                System.out.println("Value was not A, B, C, D or E");
                break;
        }


        String month = "Jary";
        switch (month.toLowerCase()) {
            case "January":
                System.out.println("Jan");
                break;
            case "August":
                System.out.println("August");
                break;
            case "September":
                System.out.println("September");
                break;
            default:
                System.out.println("not sure");

        }


    }
}
