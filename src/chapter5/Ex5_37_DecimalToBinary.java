package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 7/29/2016.
 */
public class Ex5_37_DecimalToBinary {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);


        System.out.println("enter decimal : ");
        int decimal = input.nextInt();
        String result ="";


        while (decimal > 0){
            result = decimal % 2 + result;
            decimal = decimal / 2;
        }


        System.out.println(result);


    }
}
