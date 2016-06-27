package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 6/27/2016.
 */
public class Eg5_15_PrimeNumber {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_of_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        System.out.println("The first 50 prime number are \n");

        while (count < NUMBER_OF_PRIMES){
            boolean isPrime = true;

            for (int divisor = 2; divisor <= number / 2; divisor++){
                if (number % divisor == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime){
                count++;

                if (count % NUMBER_of_PRIMES_PER_LINE == 0){
                    System.out.println(number);
                }
                else {
                    System.out.print(number + " ");

                }
            }
            number++;
        }
    }
}
