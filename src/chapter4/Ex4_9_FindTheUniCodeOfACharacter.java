package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/22/2016.
 */
public class Ex4_9_FindTheUniCodeOfACharacter {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter character :");
        String karakter = input.nextLine();
        char ch = karakter.charAt(0);

        System.out.print("The unicode for the character "+ch+" is " +(int) ch);
    }
}
