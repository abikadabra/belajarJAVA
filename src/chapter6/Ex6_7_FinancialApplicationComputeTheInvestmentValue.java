package chapter6;

import java.util.Scanner;

/**
 * Created by USER on 8/9/2016.
 */
public class Ex6_7_FinancialApplicationComputeTheInvestmentValue {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentsAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double annual = input.nextDouble();
        System.out.print("Enter number of year: ");
        int year = input.nextInt();

        futureInvestmentValue(investmentsAmount,annual,year);
        for (int i = 0; i < year; i++) {

            System.out.printf("%3d%10.2f\n",i+1,futureInvestmentValue(investmentsAmount,annual,i+1) );
        }

    }

    public static double futureInvestmentValue(double investmentsAmount, double Annual, int year){
        double monthlyInterestRate = Annual/1200;
        return investmentsAmount*Math.pow((1+monthlyInterestRate),year*12);
    }
}