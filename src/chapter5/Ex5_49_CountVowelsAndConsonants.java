package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 8/4/2016.
 */
public class Ex5_49_CountVowelsAndConsonants {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a string:");
            String s = input.nextLine();
            String s2 = "";
            int numberOfVowel = 0;
            int numberOfCon = 0;

            for (int i = s.length() - 1; i >= 0; i--) {
                switch (s.toLowerCase().charAt(i)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        numberOfVowel++;
                        break;
                    case ' ':
                        break;
                    default:
                        numberOfCon++;
                        break;

                }
            }

            System.out.println("The number of vowels is " + numberOfVowel);
            System.out.println("The number of consonants is " + numberOfCon);

        }

    }