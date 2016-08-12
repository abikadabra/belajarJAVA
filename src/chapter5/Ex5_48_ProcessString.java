package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 8/4/2016.
 */
public class Ex5_48_ProcessString {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string :");
        String str = input.nextLine();


        for (int i = 0; i < str.length(); i++) {
            if ((i + 1) % 2 == 1) {
                System.out.print(str.charAt(i));
            }
        }
    }
}
