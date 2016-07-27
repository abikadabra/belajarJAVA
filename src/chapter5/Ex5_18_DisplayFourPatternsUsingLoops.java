package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 7/20/2016.
 */
public class Ex5_18_DisplayFourPatternsUsingLoops {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int n = input.nextInt();

        System.out.println("\nPattern A");
        for (int i = 1; i <= n; i++){

            for (int j = 1;j <= i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("\nPattern B");
        for (int i = 0; i < n;i++){
            for (int j=1; j <= n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("\nPattern C");
        for (int i = 1;i <= n;i++){
            for (int j = 1; j <= n-i;j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("\nPattern D");
        for (int i = 0; i<n;i++){
            for (int j = i;j>0;j--){
                System.out.print("  ");
            }
            for (int j = 1;j<= n-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
