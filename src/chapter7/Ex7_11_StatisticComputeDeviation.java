package chapter7;

import java.util.Scanner;

/**
 * Created by USER on 8/29/2016.
 */
public class Ex7_11_StatisticComputeDeviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];

        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }

        System.out.printf("The mean is %.2f\n", mean(numbers));
        System.out.printf("The standard deviation is %.5f",deviation(numbers));
    }

    public static double mean(double[]m) {
        double mean = 0;
        for (int i = 0; i < m.length; i++) {
            mean = mean + m[i];
        }
        return mean / m.length;
    }


    public static double deviation(double[]m) {
        double deviation = 0;
        double mean = mean(m);
        for (int i = 0; i < m.length; i++) {
            deviation = deviation + Math.pow((m[i] - mean), 2);
        }
        return Math.sqrt(deviation / (m.length - 1));
    }
}
