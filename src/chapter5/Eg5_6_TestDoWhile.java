package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 6/27/2016.
 */
public class Eg5_6_TestDoWhile {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int data;
        int sum = 0;

        do{
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
            sum +=data;

        }while (data!=0);

        System.out.print("The sum is "+sum);

    }
}
