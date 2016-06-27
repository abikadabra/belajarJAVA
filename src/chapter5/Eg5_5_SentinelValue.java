package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 6/27/2016.
 */
public class Eg5_5_SentinelValue {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();

        int sum = 0;
        while (data != 0){
            sum += data;

            System.out.print("Enter an integer (The input ends if it is 0): ");
            data = input.nextInt();
        }
        System.out.print("The sum is "+sum);
    }
}
