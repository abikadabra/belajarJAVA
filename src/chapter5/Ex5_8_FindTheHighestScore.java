package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 6/28/2016.
 */
public class Ex5_8_FindTheHighestScore {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);


            System.out.print("Enter the number of students:");
            int numberStudent = input.nextInt();
            int highScore = 0;
            String maxName = "";

            for (int i = 0; i < numberStudent; i++) {
                System.out.print("Enter name and score of student (" + (i + 1)
                        + "):");
                String name = input.next();
                int score = input.nextInt();
                if (score > highScore) {
                    highScore = score;
                    maxName = name;
                }

            }

            System.out.println("The student with the highest score is " + maxName);
            System.out.println("The highest score is " + highScore);

        

    }
}
