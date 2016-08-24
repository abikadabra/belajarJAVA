package chapter7;

import chapter6.Eg6_10_RandomCharacter;

import java.util.Random;

/**
 * Created by USER on 8/23/2016.
 *
 * The program given in Listing 7.4 does the following:
 1. Generates 100 lowercase letters randomly and assigns them to an array of characters, as
 shown in Figure 7.7a. You can obtain a random letter by using the getRandomLower-
 CaseLetter() method in the RandomCharacter class in Listing 6.10.
 2. Count the occurrences of each letter in the array. To do so, create an array, say counts,
 of 26 int values, each of which counts the occurrences of a letter, as shown in
 Figure 7.7b. That is, counts[0] counts the number of a’s, counts[1] counts the
 number of b’s, and so on.

 FIGURE 7.7 The chars array stores 100 characters, and the counts array stores 26 counts,
 each of which counts the occurrences of a letter.
 */

public class Eg7_4_CountLettersInArray {
    public static void main(String[]args){
        char[] chars = createArray();
        System.out.println("The lowercase letters are: ");
        displayArray(chars);

        int[] counts = countLetters(chars);
        System.out.println();
        System.out.println("The occurrences of each letter are:");
        displayCounts(counts);
    }

    public static char[] createArray(){
        char[] chars = new char[100];
        for (int i = 0; i < chars.length; i++) {
            chars[i]= Eg6_10_RandomCharacter.getRandomLowerCaseLetter();
        }
        return chars;
    }

    public static void displayArray(char[] chars){
        for (int i = 0; i < chars.length;i++) {
            if ((i + 1) % 20 == 0) {
                System.out.println(chars[i]);
            } else {
                System.out.print(chars[i]+" ");
            }
        }
    }

    public static int[] countLetters(char[] chars){
        int[] counts = new int[26];
        for (int i = 0; i < chars.length; i++) {
            counts[chars[i] - 'a']++;
        }
        return counts;
    }

    public static void displayCounts(int[] counts){
        for (int i = 0; i < counts.length; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println(counts[i] + " " + (char) (i + 'a'));
            } else {
                System.out.print(counts[i] + " " + (char) (i + 'a') + " ");
            }
        }
    }
}