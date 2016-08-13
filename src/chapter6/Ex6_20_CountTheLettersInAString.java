package chapter6;

import sun.security.util.Length;

import java.util.Scanner;

/**
 * Created by USER on 8/13/2016.
 */
public class Ex6_20_CountTheLettersInAString {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Letter: ");
        String letter = input.nextLine();

        System.out.print("number of letters in the string : "+countLetters(letter));
    }

    public static int countLetters (String letter){
        int countletter = 0;
        for (int i = 0;i < letter.length();i++){
            if (isLetter(letter.charAt(i))){
                countletter++;
            }
        }
        return countletter;
    }
    public static boolean isLetter(char letter){
        letter = Character.toUpperCase(letter);
        return (letter >= 'A' && letter <=  'Z');
    }
}
