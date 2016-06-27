package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/27/2016.
 */
public class Ex4_19_BusinessCheckISBN10{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String number = input.nextLine();

        int d1 = (int)(number.charAt(0))-48;
        int d2 = (int)(number.charAt(1))-48;
        int d3 = (int)(number.charAt(2))-48;
        int d4 = (int)(number.charAt(3))-48;
        int d5 = (int)(number.charAt(4))-48;
        int d6 = (int)(number.charAt(5))-48;
        int d7 = (int)(number.charAt(6))-48;
        int d8 = (int)(number.charAt(7))-48;
        int d9 = (int)(number.charAt(8))-48;


        int checksum =(d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
        if (checksum == 10) {
            System.out.print("The ISBN-10 number is  " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9+"X");
        } else if (checksum != 10) {
            System.out.print("The ISBN-10 number is  " + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + checksum);
        }

    }
}
