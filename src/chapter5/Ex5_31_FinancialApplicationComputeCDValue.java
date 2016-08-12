package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 7/29/2016.
 */
public class Ex5_31_FinancialApplicationComputeCDValue {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the initial deposit amount: ");
        double amount = input.nextDouble();

        System.out.println("Enter annual percentage yield: ");
        double percentageYield = input.nextDouble();

        System.out.println("Enter the number of months: ");
        double numberMonth = input.nextDouble();


        percentageYield /= 12*100;

        System.out.printf("%5s%10s\n","month","CD Value");

        for (int i = 1; i <= numberMonth; i++) {
            amount = amount * (1 + percentageYield);
            System.out.printf("%d%14.2f\n", i, amount);
        }
    }
}
