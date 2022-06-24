public class CodeMagnets {

    class Shuffle1 {
        public void main(String[] args) {


            int x = 3;
            while (x > 0) {
                if (x > 2) {
                    System.out.println("a");
                    x = x - 1;
                } else if (x == 1) {
                    System.out.println("d");
                    x = x - 1;
                } else if (x == 2) {
                    System.out.println("b c");
                }
            }
        }


