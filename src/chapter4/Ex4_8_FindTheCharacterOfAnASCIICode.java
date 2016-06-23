package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/22/2016.
 *
 * (Find the character of an ASCII code) Write a program that receives an ASCII code
 (an integer between 0 and 127) and displays its character.
 */
public class Ex4_8_FindTheCharacterOfAnASCIICode {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code :");
        int code = input.nextInt();

        System.out.println("The character for ASCII code "+code+" is " +(char) code);
    }
}
