package chapter6;

/**
 * Created by USER on 8/11/2016.
 */
public class Ex6_13_SumSeries {
    public static void main(String[]args){

            System.out.printf("%s%15s","i","m(i)\n");
            System.out.print("-------------------\n");

            for (int i = 1; i <= 20; i++) {
                System.out.printf("%d%15.4f\n", i, sumSeries(i));
            }
        }

        public static double sumSeries(int s){
            double sum = 0;
            for (double i = 1; i <= s; i++) {
                sum = sum + i / (i + 1);
            }
            return sum;
        }

}
