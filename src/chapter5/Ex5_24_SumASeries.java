package chapter5;

/**
 * Created by USER on 7/27/2016.
 */
public class Ex5_24_SumASeries {
    public static void main (String[]args){
        double sum = 0;

        for (int i = 1; i <= 97; i += 2) {
            sum += i / (i + 2.0);
        }

        System.out.println("Sum of the series is:" + sum);

    }
}
