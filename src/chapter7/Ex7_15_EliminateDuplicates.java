package chapter7;

import java.util.Scanner;

/**
 * Created by USER on 8/31/2016.
 *
 * (Eliminate duplicates) Write a method that returns a new array by eliminating the
 duplicate values in the array using the following method header:
 public static int[] eliminateDuplicates(int[] list)
 Write a test program that reads in ten integers, invokes the method, and displays
 the result. Here is the sample run of the program:
 Programming Exercises 279
 Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
 The distinct numbers are: 1 2 3 6 4 5
 */


public class Ex7_15_EliminateDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] number = new int[10];
        System.out.print("Enter ten number :");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }
        int[] distinct = eleminateDuplicates(number);

        System.out.print("The distinct number are :");
        for (int d:distinct) {
            if (d > 0) {
                System.out.print(" " + d);
            }
        }
    }

    public static int[] eleminateDuplicates(int[] list) {
        int[] distinct = new int[list.length];
        int i = 0;
        for (int d : list) {
            if (search(distinct, d) == -1) {
                distinct[i] = d;
                i++;
            }
        }
        return distinct;
    }

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }
}
