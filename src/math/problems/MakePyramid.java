package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

         */

        for (int i = 0; i < 10; i++) {
            //insert loop to make spaces------
            for(int j = 0; j < 10 - i; j++){
                System.out.print(" ");
            }
            //insert loop to make stars-------
           for(int k = 0; k <= i; k++){
               System.out.print("* ");
           }
            System.out.println();
            }

        }
    }

