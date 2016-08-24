package chapter7;

/**
 * Created by USER on 8/24/2016.
 */
public class Eg7_5_VarArgsDemo {
    public static void main(String[]args){
        printMax(34, 4, 4, 2, 56.5);
        printMax(new double[]{1, 2, 3});
    }

    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
            System.out.println("The max value is "+result);

    }
}
