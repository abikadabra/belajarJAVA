package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/26/2016.
 */
public class Ex4_12_HexToBinary {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String hexDigit = input.nextLine();

        char ch = Character.toUpperCase(hexDigit.charAt(0));
        int value = 0;
        if (ch <= 'F' && ch >= 'A') {
            value = ch - 'A' + 10;

        } else if (Character.isDigit(ch)) {
            value = ch - '0';
        }
        else {
            System.out.println(ch + " is an invalid input");
        }
        System.out.println("The decimal value for hex digit " + ch + " is "
                + Integer.toBinaryString(value));

    }
}
