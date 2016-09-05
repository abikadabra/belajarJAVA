package chapter7;

import java.util.Scanner;

/**
 * Created by USER on 9/5/2016.
 *
 * (Revise selection sort) In Section 7.11, you used selection sort to sort an array.
 The selection-sort method repeatedly finds the smallest number in the current
 array and swaps it with the first. Rewrite this program by finding the largest number
 and swapping it with the last. Write a test program that reads in ten double
 numbers, invokes the method, and displays the sorted numbers.
 */

public class Ex7_20_ReviseSelectionSort {
    public static void main(String[] args) {
        double[] number = new double[10];
        inputNumber(number);
        selectionSort(number);
        result(number);
    }

    public static void inputNumber(double[] number) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten number :");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextDouble();
        }
    }

    public static void selectionSort(double[] number) {
        for (int i = 0; i < number.length - 1; i++) {
            double currentMin = number[i];
            int currentMinIndex = i;

            for (int k = i + 1; k < number.length; k++) {
                if (currentMin > number[k]) {
                    currentMin = number[k];
                    currentMinIndex = k;
                }
            }
            if (currentMinIndex != i) {
                number[currentMinIndex] = number[i];
                number[i] = currentMin;
            }
        }
    }

    public static void result(double[] number) {
        for (double result : number) {
            System.out.print(result+" ");
        }
    }
}
