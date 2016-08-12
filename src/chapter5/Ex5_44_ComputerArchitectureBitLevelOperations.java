package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 8/2/2016.
 */
public class Ex5_44_ComputerArchitectureBitLevelOperations {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer :");
        short number = input.nextShort();
        String binary="";
        short ext = 01;


        for (int i = 0; i < 16; i++) {
            short temp = (short) (number & ext);
            binary = temp + binary;
            number = (byte) (number >> 1);
        }



            System.out.print(binary);

    }
}
