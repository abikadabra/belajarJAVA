package chapter7;

import java.util.Scanner;

/**
 * Created by USER on 8/29/2016.
 */
public class Ex7_8_AverageAnArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] values = new double[10];
        System.out.print("Enter ten double: ");
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }
        System.out.println("average is:" + average(values));
    }

    public static int average(int[] array) {
        int average = 0;
        for (int i : array) {
            average = average + i;
        }
        return average / array.length;
    }

    public static double average(double[] array) {
        double average = 0;
        for (double i : array) {
            average = average + i;
        }

        return average / array.length;
    }
}
