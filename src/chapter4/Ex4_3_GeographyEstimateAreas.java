package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/22/2016.
 *
 * (Geography: estimate areas) Find the GPS locations for Atlanta, Georgia;
 Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina from
 www.gps-data-team.com/map/ and compute the estimated area enclosed by these
 four cities. (Hint: Use the formula in Programming Exercise 4.2 to compute the
 distance between two cities. Divide the polygon into two triangles and use the
 formula in Programming Exercise 2.19 to compute the area of a triangle.)
 */
public class Ex4_3_GeographyEstimateAreas {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        double x1 = 33.7489954;
        double y1 = -84.3879824;

        double x2 = 28.5383355;
        double y2 = -81.37923649999999;

        double x3 = 32.0835407;
        double y3 = -81.09983419999998;

        double x4 = 35.2270869;
        double y4 = -80.84312669999997;

        double side1 = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        double side2 = Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
        double side3 = Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
        double s = (side1+side2+side3)/2;
        double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

        side1 = Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
        side2 = Math.sqrt(Math.pow(x1-x4,2)+Math.pow(y1-y4,2));
        side3 = Math.sqrt(Math.pow(x4-x3,2)+Math.pow(y4-y3,2));
        s = (side1+side2+side3)/2;
        area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));


        System.out.println("The area of the triangle is : " +area);


    }
}
