package chapter6;

import java.util.Scanner;

/**
 * Created by USER on 8/19/2016.
 */
public class Ex6_31_FinancialCreditCardNumberValidation {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a credit card number as a long integer: ");
        long cardnum = input.nextLong();

        if (cardnum != 0) {
            if (isValid(cardnum)) {
                System.out.print("is valid");
            } else {
                System.out.print("is invalid");
            }
        }
    }

    public static boolean isValid(long number) {

        int firstPrefix = (int) getPrefix(number, 1);
        if (firstPrefix != 4 && firstPrefix != 5 && firstPrefix != 3 && firstPrefix != 6) {
            return false;
        }

        if (firstPrefix == 3) {
            int secondPrefix = (int) getPrefix(number, 2);
            if (secondPrefix != 37) {
                return false;
            }
        }

        if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 != 0) {
            return false;
        }
        return true;

    }

    public static int sumOfDoubleEvenPlace(long number){
        int n = getSize(number);
        int sum = 0;
        for (int i = 2; i <= n; i +=2) {
            sum = sum + getDigit(2 * getDigitFromIndex(number, i));
        }
        return sum;
    }

    public static int getDigitFromIndex(long number, int index) {
        int digit;
        digit = (int) (((number / Math.pow(10, index - 1))) % 10);
        return digit;
    }

    public static int getDigit(int number){

        int firstDigit = number / 10;
        int secondDigit = number % 10;

        if (firstDigit == 0) {
            return number;
        } else {
            return firstDigit + secondDigit;
        }
    }

    public static int sumOfOddPlace(long number){
        int n = getSize(number);
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum = sum + getDigitFromIndex(number, i);
        }
        return sum;
    }

    public static boolean preFixMatched(long number, int d){

        if (getPrefix(number, getSize(d)) == d) {
            return true;
        }
        return false;
    }

    public static int getSize(long d) {

        int numberOfDigit = 1;
        while ((d = d / 10) != 0) {
            numberOfDigit++;
        }
        return numberOfDigit;
    }

    public static long getPrefix(long number, int k) {

        int numberOfDigit = getSize(number);
        return number / (long) (Math.pow(10.0, (double) (numberOfDigit - k)));

    }

}