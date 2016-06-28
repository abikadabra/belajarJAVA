package chapter5;

import java.util.Scanner;

/**
 * Created by USER on 6/28/2016.
 */
public class Ex5_16_FindFactorOfAnInteger {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);


        int i =0;
        System.out.print("Input number: ");
        int number = input.nextInt();

        for (i = 2;i <= number;){
            if (number%i == 0){
                System.out.print(i+" ");
                number/=i;

            }else {
                i++;
            }
        }
    }
}
