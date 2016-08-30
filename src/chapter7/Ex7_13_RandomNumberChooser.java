package chapter7;

import java.util.Scanner;

/**
 * Created by USER on 8/30/2016.
 *
 * (Random number chooser) Write a method that returns a random number between
 1 and 54, excluding the numbers passed in the argument. The method header is
 specified as follows:
 public static int getRandom(int... numbers)
 */


public class Ex7_13_RandomNumberChooser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("input length : ");
        int leng = input.nextInt();

        int[]inpt = new int[leng];

        System.out.print("Enter numbers to exclude from random: ");

        for (int i = 0;i<inpt.length;i++) {
            inpt[i] = input.nextInt();
        }
        System.out.println("Number random: " + getRandom(inpt));
    }


    public static int getRandom(int... inpt) {
        int random = (int) (Math.random() * 54 + 1);
        for (int i = 0; i < inpt.length; i++) {
            if (random == inpt[i]) {
                random = (int) (Math.random() * 54 + 1);
                i = -1;
            }
        }
        return random;
    }
}