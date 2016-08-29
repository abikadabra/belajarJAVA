package chapter7;

/**
 * Created by USER on 8/29/2016.
 */
public class Ex7_6_ReviseListing5_15PrimeNumber {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;

        int[] primeNumbers = new int[NUMBER_OF_PRIMES];
        int index = 0;
        for (int i = 2; index < NUMBER_OF_PRIMES; i++) {
            if (isPrime(i)) {
                primeNumbers[index++] = i;
            }
        }
        printArray(primeNumbers, 10);
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[]array, int numberPerline) {
        for (int i = 0; i < array.length;i++) {
            System.out.print(" "+ array[i]);
            if ((i + 1) % numberPerline == 0) {
                System.out.println();
            }
        }
    }
}
