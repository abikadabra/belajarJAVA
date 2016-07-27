package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 7/27/2016.
 */
public class Ex5_22_FinancialApplicationLoanAmortizationSchedule {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Loan amount:");
        double loanAmount = input.nextDouble();


        System.out.print("Enter number of years:");
        int numberOfYears = input.nextInt();


        System.out.print("Annual interest rate:");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;

        double monthlyPayment = loanAmount * monthlyInterestRate
                / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.println("Monthly payment:" + (int) (monthlyPayment * 100)
                / 100.0);
        System.out.println("Total payment:" + (int) (totalPayment * 100)
                / 100.0);

        System.out.printf("%-18s%-18s%-18s%-18s\n", "Payment#", "Interest",
                "Principal", "Balance");

        double interest, balance = loanAmount, principal;

        for (int i = 1; i <= numberOfYears * 12; i++) {
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%-18d%-18.2f%-18.2f%-18.2f\n", i, interest,
                    principal, balance);
        }

    }
}
