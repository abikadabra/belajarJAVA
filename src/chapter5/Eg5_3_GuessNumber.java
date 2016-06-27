package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 6/27/2016.
 */
public class Eg5_3_GuessNumber {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int number = (int)(Math.random()*101);

        System.out.println("Guess a magic number between 0 and 100");


        int guess = -1;
        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = input.nextInt();

            if (guess == number){
                System.out.print("Yes,the number is " +number);
            }
            else if(guess < number){
                System.out.println("Your guess is to low");
            }
            else if (guess > number){
                System.out.println("Your guess is to high");
            }
        }
    }
}
