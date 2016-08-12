package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 8/4/2016.
 */
public class Ex5_47_BusinessCheckISBN13 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first 12 digits of an ISBN-13 as a string:");
        String number = input.nextLine();
        int sum = 0;

        if (number.length() != 12) {
            System.out.println(number + " is an invalid input");
            System.exit(0);
        }

        for (int i = 0; i < number.length(); i++) {
            if ((i + 1) % 2 == 0) {
                sum = sum + number.charAt(i) - 48;
            } else {

                sum = sum + 13 * (number.charAt(i) - 48);

            }
        }

        sum = (10 - sum%10)%10;
        System.out.println("The ISBN-13 number is " +number + sum);

    }
}
