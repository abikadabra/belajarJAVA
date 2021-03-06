package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 6/28/2016.
 * (Compute the greatest common divisor) Another solution for Listing 5.9 to find
 the greatest common divisor of two integers n1 and n2 is as follows: First find d
 to be the minimum of n1 and n2, then check whether d, d-1, d-2, . . . , 2, or 1 is
 a divisor for both n1 and n2 in this order. The first such common divisor is the
 greatest common divisor for n1 and n2. Write a program that prompts the user to
 enter two positive integers and displays the gcd.
 */
public class Ex5_14_ComputeTheGreatestCommonDivisor {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer : ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer : ");
        int n2 = input.nextInt();

        if (n1>n2){
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        for (int k =n1;true;k--){
            if (n1 % k == 0 && n2 % k == 0){
                System.out.println("The Greatest common is "+k);
                break;
            }
        }
    }
}
