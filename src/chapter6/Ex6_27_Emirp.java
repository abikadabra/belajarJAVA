package chapter6;

/**
 * Created by USER on 8/16/2016.
 */
public class Ex6_27_Emirp {
    public static void main(String[] args) {

        int count = 0;

            for (int i = 2; count < 100; i++) {

                if (isPrime(i) && isPrime(reverse(i)) && cekReverse(i)) {
                    System.out.printf("%5d",i);
                    count++;
                    if (count % 10 == 0) {
                        System.out.println();
                    }
                }
            }
    }
    public static boolean isPrime(long number) {

        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static long reverse(long number) {

        long reverse = 0;
        while (number !=0) {
            reverse = reverse * 10;
            reverse = reverse + (int)number % 10;
            number = number / 10;
        }
        return reverse;
    }

    public static boolean cekReverse(int number) {
        return (number != reverse(number));
    }
}
