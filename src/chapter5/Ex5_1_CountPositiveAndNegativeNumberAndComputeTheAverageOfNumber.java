package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 6/27/2016.
 */
public class Ex5_1_CountPositiveAndNegativeNumberAndComputeTheAverageOfNumber {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);


        int negative = 0;
        int positive = 0;
        double sum = 0;

        int integer = -1;

        while (integer != 0){

            System.out.print("Enter an integer (the input ends if it is 0) :");
            integer = input.nextInt();

            sum +=integer;
                if (integer > 0) {
                    positive++;
                }
                else if(integer < 0){
                    negative++;
                }

            if (integer == 0){
                System.out.println("the number of positive is: " + positive);
                System.out.println("the number of negative is: " + negative);
                System.out.println("the total is: " +sum);
                double average = sum/(positive+negative);
                System.out.println("the average is: " +average);
            }

        }


        if (positive + negative == 0){
            System.out.println("No number are entered except 0" );
        }

    }
}
