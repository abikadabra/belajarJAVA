package chapter7;

import java.util.Scanner;

/**
 * Created by USER on 8/25/2016.
 */
public class Ex7_2_ReverseTheNumberEntered {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);

        System.out.print("input number :");
        int[] n = new int[10];

        for (int i = 0; i < 10; i++) {
            n[i]=input.nextInt();
        }
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i] + " ");
        }
    }
}
