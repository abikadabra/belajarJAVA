package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/22/2016.

 d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
 Write a program that prompts the user to enter the latitude and longitude of two
 points on the earth in degrees and displays its great circle distance. The average
 earth radius is 6,371.01 km. Note that you need to convert the degrees into radians
 using the Math.toRadians method since the Java trigonometric methods use
 radians. The latitude and longitude degrees in the formula are for north and west.
 Use negative to indicate south and east degrees.
 */
public class Ex4_2_GeometryGreatCircleDistance {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longtitude) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter point 2 (latitude and longtitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = 637101 * Math.acos((Math.sin(Math.toRadians(x1)))*
                Math.sin(Math.toRadians(x2))+Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*Math.cos(Math.toRadians(y1-y2)));

        System.out.print("The distance between the two points is " +distance);
    }
}