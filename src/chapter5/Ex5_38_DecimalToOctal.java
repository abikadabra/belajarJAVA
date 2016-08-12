package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 7/29/2016.
 */
public class Ex5_38_DecimalToOctal {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter decimal : ");
        int octal = input.nextInt();
        String result ="";


        while (octal > 0){
            result = octal % 8 + result;
            octal = octal / 8;
        }


        System.out.println(result);
    }
}
