package chapter7;

import java.util.Scanner;

/**
 * Created by USER on 9/1/2016.
 *
 *(Sort students) Write a program that prompts the user to enter the number of students,
 the students’ names, and their scores, and prints student names in decreasing
 order of their scores.
 */
public class Ex7_17_SortStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter amount student:");
        int amountStudent = input.nextInt();

        String [] name = new String[amountStudent];
        double [] score = new double[amountStudent];
        for (int i = 0; i < name.length; i++) {
            System.out.print("\n"+(i+1)+"# Enter name of students: ");
            name[i] = input.next();
            System.out.print("Enter Score :");
            score[i] = input.nextDouble();
        }

        decreasingOrder(score,name);

        for (int i = name.length - 1; i >= 0; i--) {
            System.out.println(name[i] + " : " + score[i]);
        }
    }


    public static void decreasingOrder(double[] score, String[] name) {

        for (int i = 0; i < score.length - 1; i++) {
            double minimumScore = score[i];
            int currentMinIndex = i;

            for (int k = i + 1; k < score.length; k++) {
                if (minimumScore > score[k]) {
                    minimumScore = score[k];
                    currentMinIndex = k;
                }
            }
            if (currentMinIndex != i) {
                score[currentMinIndex] = score[i];
                score[i] = minimumScore;
                String temp = name[currentMinIndex];
                name[currentMinIndex] = name[i];
                name[i] = temp;
            }
        }
    }
}
