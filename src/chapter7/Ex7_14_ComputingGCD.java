package chapter7;

import java.util.Scanner;

/**
 * Created by USER on 8/30/2016.
 *
 * (Computing gcd) Write a method that returns the gcd of an unspecified number
 of integers. The method header is specified as follows:
 public static int gcd(int... numbers)
 Write a test program that prompts the user to enter five numbers, invokes the
 method to find the gcd of these numbers, and displays the gcd.

 */
public class Ex7_14_ComputingGCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int[] numbers = new int[5];
        System.out.print("Enter 5 number:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("gcd is " + gcd(numbers));
    }

    public static int gcd(int... numbers) {
        int gcd = min(numbers);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % gcd == 0) {
                numbers[i] = gcd;
            } else {
                numbers[i] = numbers[i] % gcd;
            }
        }
        if (gcd == min(numbers)) {
            return gcd;
        }
        return gcd(numbers);
    }

    public static int min(int... numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }

        return min;
    }
}
