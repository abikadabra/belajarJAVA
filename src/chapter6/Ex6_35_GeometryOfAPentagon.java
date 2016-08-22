package chapter6;

import java.util.Scanner;

/**
 * Created by USER on 8/22/2016.
 */
public class Ex6_35_GeometryOfAPentagon {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double s = input.nextDouble();
        System.out.printf("The area of the pentagon is %.14f",area(s));
    }

    public static double area(double side){
        double area = 5 * Math.pow(side, 2) / (4 * Math.tan(Math.PI / 5));
        return area;
    }
}
