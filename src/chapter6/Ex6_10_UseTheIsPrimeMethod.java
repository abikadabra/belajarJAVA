package chapter6;

/**
 * Created by USER on 8/10/2016.
 */
public class Ex6_10_UseTheIsPrimeMethod {
    public static void main(String[]args){
        System.out.println("The first 10000 prime number are \n");

        int numberOfPrime = 0;
        for (int i = 2; i <= 10000; i++) {
            if (isPrime(i)){
                numberOfPrime++;
            }
        }
        printPrimeNumber(numberOfPrime);
    }

    public static void printPrimeNumber(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;

        while (count < numberOfPrimes) {
            if (isPrime(number)){
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.printf("%-5s\n", number);
                } else {
                    System.out.printf("%-5s", number);
                }
            }
            number++;
        }
    }

    public static boolean isPrime(int number){
        for (int divisor =2;divisor<=number/2;divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
