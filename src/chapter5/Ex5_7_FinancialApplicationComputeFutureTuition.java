package chapter5;

/**
 * Created by USER on 6/28/2016.
 */
public class Ex5_7_FinancialApplicationComputeFutureTuition {
    public static void main(String[]args){


        int tuition = 10000;
        int total4thYear=0;

        for (int year = 1;year< 11;year++){
            tuition += tuition*0.05 ;
            if (year == 4){
                total4thYear = tuition;
            }

        }
        System.out.println("total tuition in 4 year $ "+total4thYear);
        System.out.println("total tuition in 10 year $ "+tuition);
    }
}
