package chapter7;

import java.util.Scanner;

/**
 * Created by USER on 8/25/2016.
 */


public class Ex7_3_CountOccurrenceOfNumbers {
    public static void main(String[]args) {

        int[]counts = new int[100];
        System.out.println("Enter the integer between 1 and 100 :");
        count(counts);

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] == 1){
                System.out.println((i + 1) + " occurs " + counts[i] + " time");
            } else if (counts[i] > 1) {
                System.out.println((i + 1)+" occurs " + counts[i]+" times");
            }
        }
    }

    public static void count(int[]counts){
        Scanner input = new Scanner(System.in);
        int num;
        do {
            num = input.nextInt();
            if (num >= 1 && num <= 100) {
                counts[num-1]++;
            }
        }while (num != 0);
    }
}
