package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/27/2016.
 */
public class Ex4_14_ConvertLetterGradeToNumber {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade :");
        String letterGrade = input.nextLine();

        char grade =Character.toUpperCase(letterGrade.charAt(0));
        int result = 0;

        if (grade < 'A' || grade > 'F'){
            System.out.print(letterGrade +"is an Invalid input");
        }
        else{
            switch (grade) {
                case 'A':
                    result = 4;
                    break;
                case 'B':
                    result = 3;
                    break;
                case 'C':
                    result = 2;
                    break;
                case 'D':
                    result = 1;
                    break;
                case 'F':
                    result = 0;
                    break;
            }
            System.out.print("The numeric value for grade " +grade +" is "+ result);
        }

    }
}
