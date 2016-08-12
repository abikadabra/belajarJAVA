package chapter6;

import java.util.Scanner;

/**
 * Created by USER on 8/11/2016.
 */
public class Ex6_15_FinancialApplicationPrintATexTable {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            String s1 = "Taxable Income";
            String s2 = "Single";
            String s3 = "Married Joint";
            String s4 = "Married Separate";
            String s5 = "Head Of House";

            System.out.printf("%s%15s%25s%25s%25s\n",s1,s2,s3,s4,s5);
            System.out.println("----------------------------------------------------------------------------------------------------------\n");

            for (int i = 50000; i < 60000; i = i + 50) {
                    System.out.printf("%d%23.0f%25.0f%25.0f%25.0f\n", i, computeTax(0, i),
                            computeTax(1, i), computeTax(2, i), computeTax(3, i));
            }
        }

    public static double computeTax(int stats,double taxableincome){
        double tax;

        double[] taxPercent = new double[] { 0.10, 0.15,0.25,0.28,0.33,0.35 };
        double[][] taxRates = new double[][] {{8350,33950, 82250, 171550, 372950}, {16700, 67900, 137050, 208850, 372950},{8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}};

        if (taxableincome <= taxRates[stats][0]) return taxableincome * taxPercent[0];
        tax = taxRates[stats][0] * taxPercent[0];

        for (int i = 1; i < taxRates[stats].length; i++) {
            if (taxableincome > taxRates[stats][i]) {
                tax = tax + (taxRates[stats][i] - taxRates[stats][i - 1]) * taxPercent[i];
            } else {
                return tax + (taxableincome - taxRates[stats][i - 1]) * taxPercent[i];
            }
        }
        return tax + (taxableincome - taxRates[stats][4]) * taxPercent[5];
    }

}