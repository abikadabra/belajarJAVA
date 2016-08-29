package chapter7;

/**
 * Created by USER on 8/29/2016.
 */
public class Ex7_7_CountSingleDigits {
    public static void main(String[] args) {
        int[] counts = new int[10];

        for (int i = 1;i <= 100; i++) {
            counts[(int)(Math.random()*10)]++;
        }

        System.out.println("Count number: ");
        for (int i = 0; i < counts.length; i++) {
            System.out.println(i + "s: " + counts[i]);
        }
    }
}
