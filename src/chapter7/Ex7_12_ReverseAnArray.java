package chapter7;

import java.util.Scanner;

/**
 * Created by USER on 8/29/2016.
 *
 * (Reverse an array) The reverse method in Section 7.7 reverses an array by
 copying it to a new array. Rewrite the method that reverses the array passed in
 the argument and returns this array. Write a test program that prompts the user to
 enter ten numbers, invokes the method to reverse the numbers, and displays the
 numbers.
 */
public class Ex7_12_ReverseAnArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[10];
        System.out.println("enter number: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        reverse(numbers);

        for (int reverse : numbers) {
            System.out.print(reverse + " ");
        }
        System.out.println();
    }


    public static void reverse(int[]list) {

        for (int i = 0, j = list.length - 1; i < j; i++, j--) {
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }
    }
}
