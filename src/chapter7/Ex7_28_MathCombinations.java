package chapter7;

import java.util.Scanner;

/**
 * Created by USER on 11/1/2016.
 *
 * (Math: combinations) Write a program that prompts the user to enter 10 integers
 and displays all combinations of picking two numbers from the 10.
 */
public class Ex7_28_MathCombinations {
    public static void main(String[] args) {

        System.out.print("Enter ten numbers:");
        int[] list = inputNumber();

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                System.out.print(list[i] + "," + list[j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] inputNumber() {
        int[] list = new int[10];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
        return list;
    }

}
