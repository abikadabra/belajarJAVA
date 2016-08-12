package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 8/2/2016.
 */
public class Ex5_42_FinancialApplicationFindTheSalesAmount {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter commission sought: ");
        double commissionSought = input.nextDouble();

        double sale = 0;
        double commission = 0;

        for (sale=1;commission < commissionSought;sale++){
            if (sale <= 5000) {
                commission = sale * 0.08;
            } else if (sale <= 10000) {
                commission = 5000 * 0.08 + (sale - 5000) * 0.10;
            } else {
                commission = 5000 * 0.08 + 5000 * 0.1 + (sale - 10000) * 0.12;
            }
        }
        System.out.println("Sales " + sale + " need to make a commission $ " + commissionSought);
    }
}
