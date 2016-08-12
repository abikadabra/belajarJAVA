package chapter6;

/**
 * Created by USER on 8/10/2016.
 */
public class Ex6_11_FinancialApplicationComputeCommissions {
 public static void main(String[]args) {
     System.out.printf("%s%20s","Sales Amount","Commission\n");
     System.out.print("=====================================\n");

        for (int sa=10000;sa<100000;sa=sa+5000){
            System.out.printf("%d%25.2f\n",sa,computeCommission(sa));
        }
 }


public static double computeCommission(double salesAmount){
    double commission;

    if (salesAmount >= 10000.01){
        commission = 900.0 + (salesAmount - 10000.0)*12;
    }else if (salesAmount >= 5000.0){
        commission = 400.0 + (salesAmount - 5000.0)*0.10;
    }else {
        commission = salesAmount * 0.08;
    }
    return commission;
    }
}