package chapter5;

/**
 * Created by USER on 7/21/2016.
 */
public class Ex5_20_DisplayPrimeNumberBetween2and1000 {
    public static void main (String[]args){
        final int MAX_NUMBER = 1000;
        final int NUMBER_PRIMES = 8;
        int count = 0;
        int number = 2;

        System.out.println("The prime numbers from 2 to 1000");


        while (number <= MAX_NUMBER) {

            boolean isPrime = true;


            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }


            if (isPrime) {
                count++; // Increase the count

                if (count % NUMBER_PRIMES == 0) {
                    System.out.println(number);
                }
                else
                    System.out.print(number + " ");
            }
            number++;
        }
    }
}
