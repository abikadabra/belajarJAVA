package chapter5;

/**
 * Created by USER on 7/29/2016.
 */
public class Ex5_35_Summation {
    public static void main(String[]args){

        double sum = 0;
        for (int i = 1; i <= 625; i++) {
            sum = sum + 1 / (Math.sqrt(i)+Math.sqrt(i+1));
            System.out.printf("\n%.2f",sum);
        }
    }
}
