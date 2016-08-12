package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 7/29/2016.
 */
public class Ex5_36_BusinessApplicationCheckingISBN {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer:   ");
        int number = input.nextInt();

        int d=0;

        for (int i = 1;i <=9;i++) {
             d = d+i*(number%(int)(Math.pow(10,(10-i)))/((int) Math.pow(10,(9-i))));
        }
        d=d%11;

        if (d == 10){
            System.out.println("The ISBN number is : "+number+"X");
        } else {
            System.out.println("The ISBN number is : "+number+""+d);
        }
    }
}