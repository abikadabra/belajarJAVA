package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/22/2016.
 */
public class Ex4_1_GeometryAreaOfPentagon {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();
        double s;


        s = 2*r*Math.sin(Math.PI/5);
        double area = 5*Math.pow(s,2)/(4*Math.tan(Math.PI/5));



        System.out.printf("The area of the pentagon is "+area * 100/ 100);
    }
}
