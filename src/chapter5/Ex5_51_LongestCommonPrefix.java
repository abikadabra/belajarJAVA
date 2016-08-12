package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 8/8/2016.
 */
public class Ex5_51_LongestCommonPrefix {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string:");
        String s1 = input.nextLine();
        System.out.print("Enter the second string:");
        String s2 = input.nextLine();

        int l = s2.length();
        int p = 0;

        if (s1.length() < s2.length()) {
            l = s1.length();
        }

        for (int i = 0; i <= l; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                break;
            }
            p++;
        }

        if (p == 0) {
            System.out.println(s1 + " and " + s2 + " have no common prefix");
            System.exit(0);
        }

        System.out.println("The common prefix is " + s1.substring(0, p));

    }
}