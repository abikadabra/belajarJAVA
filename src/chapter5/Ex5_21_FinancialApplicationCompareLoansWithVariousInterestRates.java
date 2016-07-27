package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 7/27/2016.
 */
public class Ex5_21_FinancialApplicationCompareLoansWithVariousInterestRates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter loan amount:");
        double loanAmount = input.nextDouble();

        System.out.print("Enter number of years: ");
        int numberOfYears = input.nextInt();

        double annualInterestRate = 5.0;

        System.out.printf("%-18s%-18s%-18s\n", "Interest Rate",
                "Monthly Payment", "Total Payment");

        while (annualInterestRate <= 8.0) {
            double monthlyInterestRate = annualInterestRate / 1200;

            double monthlyPayment = loanAmount
                    * monthlyInterestRate
                    / (1 - 1 / Math.pow(1 + monthlyInterestRate,
                    numberOfYears * 12));
            double totalPayment = monthlyPayment * numberOfYears * 12;

            System.out.printf("%-18.3f%-18.2f%-18.2f\n", annualInterestRate,
                    monthlyPayment, totalPayment);

            annualInterestRate = annualInterestRate + 1.0 / 8;

        }
    }
}