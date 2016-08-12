package chapter5;

/**
 * Created by USER on 7/29/2016.
 * (Perfect number) A positive integer is called a perfect number if it is equal to
 the sum of all of its positive divisors, excluding itself. For example, 6 is the first
 perfect number because 6 = 3 + 2 + 1. The next is 28 = 14 + 7 + 4 + 2
 + 1. There are four perfect numbers less than 10,000. Write a program to find all
 these four numbers.
 */


public class Ex5_33_PerfectNumber {
    public static void main(String[]args){

        int sum = 0;
        for (int perfectNumber = 1; perfectNumber <= 10000; perfectNumber++) {
            for (int k = 1; k < perfectNumber; k++) {
                if (perfectNumber % k == 0) {
                    sum = sum + k;
                }
            }
            if (sum == perfectNumber){
                System.out.println(perfectNumber + " is perfect number");
            }
            sum = 0;
        }
    }
}