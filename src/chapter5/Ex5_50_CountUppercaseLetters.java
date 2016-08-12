package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 8/8/2016.
 */
public class Ex5_50_CountUppercaseLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string:");
        String str = input.nextLine();
        int countUpper = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                countUpper++;
            }
        }

        System.out.println("The number of uppercase letters is " + countUpper);
    }
}
