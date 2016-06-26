package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/24/2016.
 */
public class Ex4_11_DecimalToHex {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        int decimalValue = input.nextInt();


        if (decimalValue < 0 || decimalValue > 15) {
            System.out.println(decimalValue + " is an invalid input");
        }else {
            System.out.println("The hex value is " + Integer.toHexString(decimalValue).toUpperCase());
        }


    }
}
