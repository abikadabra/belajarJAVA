package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/22/2016.
 */
public class Ex4_4_AreaOfHexagon {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side : ");
        double side = input.nextDouble();

        double area = (6*Math.pow(side,2))/(4*Math.tan(Math.PI/6));

        System.out.print("The area of the hexagon is "+area);

    }
}
