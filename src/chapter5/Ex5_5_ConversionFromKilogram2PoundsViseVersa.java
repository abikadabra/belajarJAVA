package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 6/28/2016.
 */
public class Ex5_5_ConversionFromKilogram2PoundsViseVersa {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        final int loop = 199;


        System.out.printf("%9s%12s%9s%12s","Kilograms","Pounds","Pounds","Kilogram\n");



        for (int i = 1;i<=loop;i++) {
            for (int j = 20; j <= 516; j++) {
                System.out.printf("%-5d%14.1f\t", i, i * 2.2);

                System.out.printf("%9s%12.5s\n", j, j * 0.453);

            }

        }

    }
}
