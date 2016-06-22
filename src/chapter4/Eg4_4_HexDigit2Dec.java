package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/22/2016.
 */
public class Eg4_4_HexDigit2Dec {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        String hexString = input.nextLine();

        if(hexString.length()!=1){
            System.out.println("you mus enter exactly one character");
            System.exit(1);
        }

        char ch = hexString.charAt(0);
        if (ch <= 'F' && ch >= 'A'){
            int value = ch - 'A' + 10;
            System.out.println("The decimal value for hex digit" +ch+ " is " +value);
        }
        else if (Character.isDigit(ch)){
            System.out.println("The decimal value for hex digit" +ch+ " is " +ch);
        }
        else {
            System.out.println(ch +" is an invalid input");
        }
    }
}
