package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 8/4/2016.
 */
public class Ex5_45_StatisticComputeMeanAndStandardDeviation {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter ten numbers: ");
        double mean = 0;
        double deviation = 0;

        for (int i = 0;i<10;i++) {
            double number = input.nextDouble();
            mean = mean + number;
            deviation = deviation+ Math.pow(number,2);

        }

        System.out.printf("The mean is %.2f\n", mean / 10);
        System.out.printf("The standard deviation is %.5f",Math.sqrt((deviation-(Math.pow(mean,2)/10))/9));
    }
}
