package chapter7;

import java.util.Scanner;

/**
 * Created by USER on 8/24/2016.
 *
 * *7.1 (Assign grades) Write a program that reads student scores, gets the best score,
 and then assigns grades based on the following scheme:
 Grade is A if score is Ú best - 10
 Grade is B if score is Ú best - 20;
 Grade is C if score is Ú best - 30;
 Grade is D if score is Ú best - 40;
 Grade is F otherwise.
 The program prompts the user to enter the total number of students, then prompts
 the user to enter all of the scores, and concludes by displaying the grades. Here
 is a sample run:
 Enter the number of students: 4
 Enter 4 scores: 40 55 70 58
 Student 0 score is 40 and grade is C
 Student 1 score is 55 and grade is B
 Student 2 score is 70 and grade is A
 Student 3 score is 58 and grade is B
 */
public class Ex7_1_AssignGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter number of students: ");
        int student = input.nextInt();
        int[] scores = new int[student];
        int best = 0;


        System.out.print("Enter " + student + " scores: ");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
            if (scores[i] > best)
                best=scores[i];
        }

        char grade;
        String output = "";
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= best - 10)
                grade = 'A';
            else if (scores[i] >= best - 20)
                grade = 'B';
            else if (scores[i] >= best - 30)
                grade = 'C';
            else if (scores[i] >= best - 40)
                grade = 'D';
            else
                grade = 'F';
            output += "Student " + i + " score is " + scores[i] + " and grade is " + grade + "\n";

        }
        System.out.printf(output);
    }
}
