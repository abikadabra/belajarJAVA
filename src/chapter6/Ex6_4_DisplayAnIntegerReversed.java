package chapter6;

import java.util.Scanner;

/**
 * Created by USER on 8/9/2016.
 *
 * (Display an integer reversed) Write a method with the following header to display
 an integer in reverse order:
 public static void reverse(int number)
 For example, reverse(3456) displays 6543. Write a test program that prompts
 the user to enter an integer and displays its reversal

 */
public class Ex6_4_DisplayAnIntegerReversed {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number : ");
        int number = input.nextInt();
        reverse(number);
    }

    public static void reverse(int number){
        while (number != 0) {
            int reverse = number % 10;
            number = number / 10;
            System.out.println(reverse);
        }
    }
}