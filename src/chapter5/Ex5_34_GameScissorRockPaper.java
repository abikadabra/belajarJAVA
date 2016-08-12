package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 7/29/2016.
 */
public class Ex5_34_GameScissorRockPaper {
    public static void main(String[]args){

        Scanner input = new Scanner(System.in);

        int guess;
        int rand;
        int guessCount=0;
        int randCount=0;

        do {
            rand = (int) (Math.random() * 3);
            System.out.print("Scissor (0),Rock (1), paper (2): ");
            guess = input.nextInt();

            if (rand == 0) {
                System.out.println("Scissor");
            } else if (rand == 1) {
                System.out.println("Rock");
            } else if (rand == 2) {
                System.out.println("paper");
            }

            if (guess == 0) {
                System.out.println("Scissor");
            } else if (guess == 1) {
                System.out.println("Rock");
            } else if (guess == 2) {
                System.out.println("paper");
            }


            if (guess == rand){
                System.out.print("Draw!");
            }
            else if(guess == 0 && rand == 1){
                System.out.print("Lose!");
                randCount++;
            }
            else if (guess == 0 && rand == 2){
                System.out.print("You Win!");
                guessCount++;
            }
            else if(guess == 1 && rand == 0) {
                System.out.print("You Win! ");
                guessCount++;
            } else if(guess == 1 && rand == 2){
                System.out.print("Lose! ");
                randCount++;
            }
            else if(guess == 2 && rand == 0){
                System.out.print("Lose! ");
                randCount++;
            }
            else if(guess == 2 && rand == 1){
                System.out.print("Win!");
                guessCount++;
            }

            System.out.println("\n You "+guessCount+" vs "+randCount+" Computer");
        }while ((guessCount-randCount)<= 2&&(randCount-guessCount)<=2);


    }
}
