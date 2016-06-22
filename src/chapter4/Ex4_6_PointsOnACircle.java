package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/22/2016.
 */
public class Ex4_6_PointsOnACircle {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        double a = Math.random()*2*Math.PI;
        double x1 = 40 * Math.cos(a);
        double y1 = 40 * Math.sin(a);

        a = Math.random()*2*Math.PI;
        double x2 = 40 * Math.cos(a);
        double y2 = 40 * Math.sin(a);

        a = Math.random()*2*Math.PI;
        double x3 = 40 * Math.cos(a);
        double y3 = 40 * Math.sin(a);

        double side1 = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        double side2 = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
        double side3 = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2));

        double a1 = Math.acos((Math.pow(side2, 2) + Math.pow(side3, 2) - Math.pow(side1, 2)) / (2 * side2 * side3));
        double a2 = Math.acos((Math.pow(side1, 2) + Math.pow(side3, 2) - Math.pow(side2, 2)) / (2 * side1 * side3));
        double a3 = Math.acos((Math.pow(side1, 2) + Math.pow(side2, 2) - Math.pow(side3, 2)) / (2 * side1 * side2));

        System.out.println("Angles for triangle1 : "+Math.toDegrees(a1));
        System.out.println("Angles for triangle2 : "+Math.toDegrees(a2));
        System.out.println("Angles for triangle3 : "+Math.toDegrees(a3));

    }
}
