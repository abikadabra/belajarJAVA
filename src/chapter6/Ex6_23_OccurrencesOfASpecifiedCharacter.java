package chapter6;

import java.util.Scanner;

/**
 * Created by USER on 8/15/2016.
 */
public class Ex6_23_OccurrencesOfASpecifiedCharacter {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("input string: ");
        String inpt = input.nextLine();
        System.out.print("enter a character :");
        char fnd = input.next().charAt(0);

        System.out.print("String you input is ("+inpt+") and character you looking for is ("+fnd+")");
        System.out.println("\ntotal ("+fnd+") is "+count(inpt,fnd));
    }

    public static int count(String inpt,char fnd){
        int count = 0;
        for (int i = 0; i < inpt.length(); i++) {
            if (inpt.toLowerCase().toUpperCase().charAt(i) == fnd) {
                count++;
            }
        }
        return count;
    }
}
