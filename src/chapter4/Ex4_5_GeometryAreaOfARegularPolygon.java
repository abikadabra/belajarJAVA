package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/22/2016.
 */
public class Ex4_5_GeometryAreaOfARegularPolygon {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of side: ");
        double numberSide = input.nextDouble();
        System.out.print("Enter the side: ");
        double theSide = input.nextDouble();

        double area = (numberSide*Math.pow(theSide,2))/(4*Math.tan(Math.PI/numberSide));

        System.out.print("The area of the polygon is "+area);

    }
}
