package chapter6;

import java.util.Scanner;

/**
 * Created by USER on 8/22/2016.
 */
public class Ex6_37_FormatAnInteger {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the integer: ");
        int in = input.nextInt();
        System.out.print("Enter long string: ");
        int str = input.nextInt();
        System.out.print(format(in,str));
    }

    public static String format(int in, int str) {
        int numberOfDigit = getSize(in);
        String format = String.valueOf(in);

        for (int i = 0; i < str - numberOfDigit; i++) {
            format = "0" + format;
        }

        return format;
    }

    public static int getSize(long in) {

        int numberOfDigit = 1;
        while ((in = in / 10) != 0) {
            numberOfDigit++;
        }
        return numberOfDigit;
    }
}
