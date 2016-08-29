package chapter7;

import java.util.Scanner;

/**
 * Created by USER on 8/29/2016.
 */
public class Ex7_10_FindTheIndexOfTheSmallestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();

        }
        System.out.println("The minimum number is :"+ numbers[indexOfSmallestElement(numbers)]+" index "+ indexOfSmallestElement(numbers));
    }

    public static int indexOfSmallestElement(double[] array) {
        if (array.length <= 1) {
            return 0;
        }
        double min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
