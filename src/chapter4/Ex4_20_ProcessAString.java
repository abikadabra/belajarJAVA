package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/27/2016.
 */
public class Ex4_20_ProcessAString {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter some string:");
        String string = input.nextLine();
        System.out.println("The string length is " + string.length());
        System.out.println("The first character is " + string.charAt(0));

    }
}
