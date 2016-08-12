package chapter6;

import java.util.Scanner;

/**
 * Created by USER on 8/9/2016.
 *
 * (Palindrome integer) Write the methods with the following headers
 // Return the reversal of an integer, i.e., reverse(456) returns 654
 public static int reverse(int number)
 // Return true if number is a palindrome
 public static boolean isPalindrome(int number)
 Use the reverse method to implement isPalindrome. A number is a palindrome
 if its reversal is the same as itself. Write a test program that prompts the
 user to enter an integer and reports whether the integer is a palindrome.
 */
public class Ex6_3_PalindromeInteger {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        int s = input.nextInt();

        if (isPalindrome(s)) {
            System.out.print(s + " is a palindrome");
        } else {
            System.out.println(s + " is not a palindrome ");
        }
    }

    public static int reverse(int number) {
        int low = 0;
        int high ;

        do {
            high = number % 10;
            low = low * 10 + high;
            number = number / 10;
        }while (number != 0);

        return low;
    }

    public static boolean isPalindrome(int number){
        return (number == reverse(number));
    }
}
