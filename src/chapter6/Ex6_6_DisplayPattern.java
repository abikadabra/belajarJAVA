package chapter6;

import java.util.Scanner;

/**
 * Created by USER on 8/9/2016.
 */
public class Ex6_6_DisplayPattern {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);

        System.out.println("Input number of loop :");
        int loop = input.nextInt();

        displayPattern(loop);
    }

    public static void displayPattern(int n){

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n-i; k++) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
