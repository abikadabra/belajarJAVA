package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 6/28/2016.
 */
public class Ex5_3_ConversionFromKilo2Pounds {
    public static void main(String [] args){

        final int loop = 199;

        System.out.printf("%9s%12s\n","kilograms","pound");
        for (int i = 1; i<=loop;i++){
            System.out.printf("%-5d%15.1f\n",i,i*2.2);
        }

    }
}
