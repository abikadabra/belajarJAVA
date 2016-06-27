package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/27/2016.
 */
public class Ex4_13_VowelOrConsonant {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter:");
        String letter = input.nextLine();

        char karakter = Character.toUpperCase(letter.charAt(0));
        if (karakter < 'A' || karakter > 'Z'){
            System.out.print(letter +" is invalid input");
        }

        else if (karakter == 'A' || karakter == 'I' || karakter == 'U' || karakter == 'E' || karakter == 'O'){
            System.out.print(letter +" is a vowel");
        }
        else{
            System.out.print(letter+" is consonant");
        }
    }
}
