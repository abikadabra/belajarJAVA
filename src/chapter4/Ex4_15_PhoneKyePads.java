package chapter4;


import java.util.Scanner;

/**
 * Created by USER on 6/27/2016.
 */
public class Ex4_15_PhoneKyePads {
    public static void main(String []argas){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        String letter = input.nextLine();

        char inp = letter.toLowerCase().charAt(0);
        int i;


        switch (inp){
            case 'a':
            case 'b':
            case 'c':
                i = 2;
                break;

            case 'd':
            case 'e':
            case 'f':
                i = 3;
                break;

            case 'g':
            case 'h':
            case 'i':
                i = 4;
                break;

            case 'j':
            case 'k':
            case 'l':
                i = 5;
                break;

            case 'm':
            case 'n':
            case 'o':
                i = 6;
                break;

            case 'p':
            case 'q':
            case 'r':
                i = 7;
                break;

            case 't':
            case 'u':
            case 'v':
                i = 8;
                break;

            case 'w':
            case 'x':
            case 'y':
            case 'z':
                i = 9;
                break;

            default:
                i= 0;
                break;
        }
        if (i != 0) {
            System.out.print("The corresponding number is " + i);
        }else {
            System.out.print(letter + " is an invalid input");
        }
    }
}
