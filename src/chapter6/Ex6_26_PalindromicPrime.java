package chapter6;

/**
 * Created by USER on 8/16/2016.
 */
public class Ex6_26_PalindromicPrime {
    public static void main(String[] args) {

        int count=0;
        for (int i = 0; count < 100; i++) {
            if (isPrime(i) && isPalindrome(i)) {
                System.out.printf("%7d",i);
                count++;
                if (count % 10 == 0 && i != 0)
                System.out.println();
            }
        }
    }


    public static  boolean isPrime(int number){
        if (number < 2){
            return false;
        }
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(long number){
        return (number == reverse(number));
    }

    public static long reverse(long number) {
        long low = 0;
        long high;

        do {
            high = number % 10;
            low = low * 10 + high;
            number = number / 10;
        } while (number != 0);
        return low;

    }
}