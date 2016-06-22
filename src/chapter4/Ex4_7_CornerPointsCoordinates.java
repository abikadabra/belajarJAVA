package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/22/2016.
 */
public class Ex4_7_CornerPointsCoordinates {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle : ");
        int radiusCircle = input.nextInt();

        double a1 = (Math.PI/2) - (2* Math.PI/5);
        double a2 = Math.PI/2;
        double a3 = (Math.PI/2) + (3* Math.PI)/5;
        double a4 = (Math.PI/2) + (4* Math.PI/5);
        double a5 = (Math.PI/2) + (6* Math.PI/5);

        double x1 = radiusCircle* Math.cos(a1);
        double y1 = radiusCircle* Math.sin(a1);
        double x2 = radiusCircle* Math.cos(a2);
        double y2 = radiusCircle* Math.sin(a2);
        double x3 = radiusCircle* Math.cos(a3);
        double y3 = radiusCircle* Math.sin(a3);
        double x4 = radiusCircle* Math.cos(a4);
        double y4 = radiusCircle* Math.sin(a4);
        double x5 = radiusCircle* Math.cos(a5);
        double y5 = radiusCircle* Math.sin(a5);

        System.out.printf("(%10.4f, %10.4f)\n", x1, y1);
        System.out.printf("(%10.4f, %10.4f)\n", x2, y2);
        System.out.printf("(%10.4f, %10.4f)\n", x3, y3);
        System.out.printf("(%10.4f, %10.4f)\n", x4, y4);
        System.out.printf("(%10.4f, %10.4f)\n", x5, y5);


    }
}
