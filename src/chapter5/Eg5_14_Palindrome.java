package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 6/27/2016.
 */
public class Eg5_14_Palindrome {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();
        int low = 0;
        int high = s.length();

        boolean isPalindrome = true;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break;
            }

            low++;
            high--;
        }
        if (isPalindrome){
            System.out.print(s+" is a palindrome");
        }else {
            System.out.println(s+" is not a palindrome");
        }
    }
}
