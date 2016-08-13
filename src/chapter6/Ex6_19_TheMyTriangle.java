package chapter6;

import java.util.Scanner;

/**
 * Created by USER on 8/11/2016.
 *
 *
 *
rumus = (Geometry: area of a triangle) Write a program that prompts the user to enter
three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
The formula for computing the area of a triangle is
s = (side1 + side2 + side3)/2;
area = 2s(s - side1)(s - side2)(s - side3)

--------------------------------------------------------------------------------------------

(The MyTriangle class) Create a class named MyTriangle that contains the
following two methods:
Return true if the sum of any two sides is
greater than the third side.
public static boolean isValid(double side1, double side2, double side3)
Return the area of the triangle.
public static double area(double side1, double side2, double side3)

        Write a test program that reads three sides for a triangle and computes the area if
        the input is valid. Otherwise, it displays that the input is invalid. The formula for
        computing the area of a triangle is given in Programming Exercise 2.19.
 */


public class Ex6_19_TheMyTriangle {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three  points for a triangle : ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        boolean valid = true;
        double area, s;

        valid = isValid(side1, side2, side3);

        if (valid) {
            area = (side1 * side2 * side3);

            System.out.print("The area of the triangle is: " + area);
        } else {
            System.out.println("The input is not valid");
        }
    }
    public static boolean isValid(double side1, double side2, double side3)
    {
        return (((side1 + side2) >= side3) && ((side2 + side3) >= side1) && ((side3 + side1) >= side2));
    }
    public static double area(double side1, double side2, double side3)
    {
        double s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s * (s - side1) * (s - side3));
          return area;
    }
}
