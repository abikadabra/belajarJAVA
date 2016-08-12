package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 7/29/2016.

 (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a twodigit
 number. The two digits in the number are distinct. (Hint: Generate the first
 digit. Use a loop to continuously generate the second digit until it is different
 from the first digit.)

 */
public class Ex5_32_GameLottery {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter your lottery: ");
        int guess = input.nextInt();

        int lotteryDigit1;
        int lotteryDigit2;
        int lottery;

        do {
            lottery = (int) (Math.random() * 100);
            lotteryDigit1 = lottery / 10;
            lotteryDigit2 = lottery % 10;
        }while (lotteryDigit1==lotteryDigit2);

            int guessDigit1 = guess / 10;
            int guessDigit2 = guess % 10;

        System.out.println("The lottery number is "+lottery);

        if (guess == lottery)
            System.out.println("Exact match: you win $10.000");
        else if(guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $3.000");
        else if(guessDigit1==lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit:you win  $1.000");
        else
            System.out.println("Sorry, no match");

    }
}
