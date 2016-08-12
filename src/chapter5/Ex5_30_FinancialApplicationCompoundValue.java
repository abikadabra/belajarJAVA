package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 7/28/2016.
 */
public class Ex5_30_FinancialApplicationCompoundValue {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter amount saving: ");
        double amountSaving = input.nextDouble();

        System.out.print("annual interest rate: ");
        double interestRate = input.nextDouble();

        System.out.print("number of month: ");
        double month = input.nextDouble();

        interestRate /= 12 * 100;
        double totalSave = 0;

        for (int i = 1; i <= month; i++) {
            totalSave = (totalSave + amountSaving) * (1 + interestRate);
        }
        System.out.println("total " + totalSave);

    }
}
