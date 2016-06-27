package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 6/27/2016.
 */
public class Eg5_2_GuessNumberOneTime {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int number = (int)(Math.random()*101);
        System.out.println("Guess magic number between 0 and 100");

        System.out.print("Enter your guess: ");
        int guess = input.nextInt();

            if (guess > number) {
                System.out.print("your guess is too high");
            } else if (guess < number) {
                System.out.print("your guess is too low");
            } else if (guess == number) {
                System.out.print("Yes,the number is" + number);
            }

    }
}
