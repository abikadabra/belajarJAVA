package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 6/27/2016.
 */
public class Eg5_1_RepeatAddition {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random()*10);
        int number2 = (int) (Math.random()*10);

        System.out.print("What is "+ number1 +" + "+ number2+" ? ");
        int answer = input.nextInt();

        while (number1 + number2 !=answer){
            System.out.print("Wrong answer.try again. what is " +number1 +" + "+ number2 +" ? ");
            answer = input.nextInt();
        }
        System.out.print("You got it!");
    }
}
