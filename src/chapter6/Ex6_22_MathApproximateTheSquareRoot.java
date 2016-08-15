package chapter6;

import java.util.Scanner;

/**
 * Created by USER on 8/15/2016.
 */
public class Ex6_22_MathApproximateTheSquareRoot {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        long n = input.nextLong();

        System.out.printf("The square rot of %s%s%f",n," is ",sqrt(n));
    }


    public static double sqrt(double n){
        double nextGuess = 1;
        double lastGuess;

        do {

            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;

        } while (Math.abs(lastGuess - nextGuess) > 0.0001);

        return nextGuess;
    }
}
