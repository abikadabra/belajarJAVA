package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 8/4/2016.
 */
public class Ex5_46_ReverseString {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String in = input.nextLine();
        String reverse = "";

        for (int i = 0; i < in.length(); i++) {
            reverse = in.charAt(i) + reverse;
        }
        System.out.printf("The reversed string is %s", reverse);
    }
}
