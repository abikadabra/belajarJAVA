package chapter6;

import java.util.Scanner;

/**
 * Created by USER on 8/13/2016.
 */
public class Ex6_21_PhoneKeypads {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String inpt = input.nextLine();
        String inptstr ="";

        for (int i = 0; i < inpt.length(); i++) {
            int number = getnumber(inpt.toUpperCase().charAt(i));
            if (number != 0) {
                inptstr = inptstr + number;
            }else {
                inptstr = inptstr + inpt.charAt(i);
            }
        }
        System.out.println(inptstr);
    }


    public static int getnumber(char uppercaseLetter) {
        int i;


        switch (uppercaseLetter) {
            case 'A':
            case 'B':
            case 'C':
                i = 2;
                break;

            case 'D':
            case 'E':
            case 'F':
                i = 3;
                break;

            case 'G':
            case 'H':
            case 'I':
                i = 4;
                break;

            case 'J':
            case 'K':
            case 'L':
                i = 5;
                break;

            case 'M':
            case 'N':
            case 'O':
                i = 6;
                break;

            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                i = 7;
                break;

            case 'T':
            case 'U':
            case 'V':
                i = 8;
                break;

            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                i = 9;
                break;

            default:
                i = 0;
                break;
        }
            return i;
        }

}