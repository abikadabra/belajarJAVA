package chapter6;

import java.util.Scanner;

/**
 * Created by USER on 8/22/2016.
 */
public class Ex6_39_GeometryPointPosition {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for p0,p1,and p2: ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        String p0 = "(" + x0 + ", " + y0 + ")";
        String p1 = "(" + x1 + ", " + y1 + ")";
        String p2 = "(" + x2 + ", " + y2 + ")";

        if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
            System.out.println(p2 + " is on the left side of the line from " + p0 + " to " + p1);
        } else if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
            if (onTheLineSegment(x0, y0, x1, y1, x2, y2)) {
                System.out.println(p2 + " is on the line segment from " + p0 + " to " + p1);
            } else {
                System.out.println(p2 + " is on the same line from " + p0 + " to " + p1);
            }

        } else {
            System.out.println(p2 + " is on the right side of the line from " + p0 + " to " + p1);
        }

    }


    public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        double c = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        if (c > 0) {
            return true;
        }

        return false;
    }

    public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
        double c = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
        if (c == 0) {
            return true;
        }

        return false;
    }

    public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {

        if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {

            if (((x2 < x1 && x2 > x0) || (x2 < x0 && x2 > x1)) && ((y2 < y1 && y2 > y0) || (y2 < y0 && y2 > y1))) {
                return true;
            }

        }

        return false;

    }
}
