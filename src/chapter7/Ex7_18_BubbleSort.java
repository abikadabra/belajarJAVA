package chapter7;

import java.util.Scanner;

/**
 * Created by USER on 9/1/2016.
 */
public class Ex7_18_BubbleSort {
    public static void main(String[] args) {
        double []numb = new double[howMuchNumber()];
        inputNumb(numb);
        bubbleSort(numb);


        System.out.print("after sort : ");
        for (int k = 0; k < numb.length; k++) {
            System.out.print(numb[k]+" ");
        }
    }

    public static void inputNumb(double[] numb) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number :");
        for (int i = 0; i < numb.length; i++) {
            numb[i] = input.nextDouble();
        }
    }


    public static int howMuchNumber() {
        Scanner input = new Scanner(System.in);
        System.out.print("How much number you want to input: ");
        return input.nextInt();
    }



    public static void bubbleSort(double[] numb) {

        int check = numb.length - 1;
        while (check != 0) {
            int i;
            for (i = 0; i < check; i++) {
                if (numb[i] > numb[i + 1]) {
                    double temp = numb[i];
                    numb[i] = numb[i + 1];
                    numb[i + 1]= temp;
                }
            }
            check = i-1;
        }
    }
}
