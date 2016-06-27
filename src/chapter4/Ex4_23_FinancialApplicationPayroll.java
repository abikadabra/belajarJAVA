package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/27/2016.
 */
public class Ex4_23_FinancialApplicationPayroll {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withhlding rate: ");
        double federalTax = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTax = input.nextDouble();

        double deduction = ((payRate*hoursWorked*20/100.0)+(payRate*hoursWorked*9.0/100.0));
        double netPay = ((payRate*hoursWorked)-deduction);

        System.out.println("Employee Name: " +name);
        System.out.println("Hours Worked: " +hoursWorked);
        System.out.println("Pay Rate: " +payRate);
        System.out.println("Gross pay :" +payRate*hoursWorked);
        System.out.println("Deduction:");
        System.out.println("     Federal withholding (20.0%): $" +(payRate*hoursWorked)*20/100.0);
        System.out.println("     State withholding (9.0%): $"+(payRate*hoursWorked)*9.0/100);
        System.out.println("     Total Deduction: $" + deduction);
        System.out.println("Net Pay: $" +netPay);

    }
}
