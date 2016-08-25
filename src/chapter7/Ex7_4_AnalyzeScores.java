package chapter7;

import java.util.Scanner;

/**
 * Created by USER on 8/25/2016.
 */
public class Ex7_4_AnalyzeScores {
    public static void main(String[]args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");

        int[] scores = new int[100];
        int num;
        int numberOfScores =0;
        int average = 0;

        for (int i = 0; i < 100; i++) {
            num = input.nextInt();
            if (num < 0)
                break;

            scores[i] = num;
            average = average + num;
            numberOfScores++;
        }

        average = average / numberOfScores;
        int aboveOrEqual;
        int below;
        aboveOrEqual = below = 0;
        for (int i = 0; i < numberOfScores; i++) {
            if (scores[i] >= average) {
                aboveOrEqual++;
            } else {
                below++;
            }
        }

        System.out.println("\nAverage : " + average);
        System.out.println("Number above or equal : " + aboveOrEqual);
        System.out.println("Number below average: " + below);

    }
}
