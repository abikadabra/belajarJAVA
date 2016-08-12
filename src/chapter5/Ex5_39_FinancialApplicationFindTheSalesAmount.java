package chapter5;

/**
 * Created by USER on 8/1/2016.
 */
public class Ex5_39_FinancialApplicationFindTheSalesAmount {
    public static void main(String[]args){




        double salesAmount =0;
        double commission;
        double goal=25000;

            do {
                salesAmount = salesAmount + 0.01;
                if (salesAmount >= 10000.01) {
                    commission = 5000 * 0.08 + 5000 * 0.1 + (salesAmount - 10000) * 0.12;
                } else if (salesAmount >= 5000.01) {
                    commission = 5000 * 0.08 + (salesAmount - 5000) * 0.10;
                } else {
                    commission = salesAmount * 0.08;
                }
            } while (commission < goal);

        System.out.printf("%.2f",salesAmount);

    }
}