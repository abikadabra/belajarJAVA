package chapter6;

import java.util.Scanner;

/**
 * Created by USER on 8/22/2016.
 */
public class Ex6_36_GeometryAreaOfRegularPolygon {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int numberOfSide = input.nextInt();
        System.out.print("Enter the side :");
        double side = input.nextDouble();
        System.out.printf("The area of polygon is %.14f",area(numberOfSide,side));
    }
    public static double area(int numberOfSide ,double side) {
        double area = numberOfSide * Math.pow(side,2)/(4*Math.tan(Math.PI/numberOfSide));
        return area;
    }
}
