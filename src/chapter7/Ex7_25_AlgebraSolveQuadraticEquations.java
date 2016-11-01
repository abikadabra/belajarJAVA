package chapter7;

import java.util.Scanner;

/**
 * Created by USER on 10/26/2016.
 *
 *
 * (Algebra: solve quadratic equations) Write a method for solving a quadratic
 equation using the following header:
 public static int solveQuadratic(double[] eqn, double[] roots)
 The coefficients of a quadratic equation ax2 + bx + c = 0 are passed to the
 array eqn and the real roots are stored in roots. The method returns the number
 of real roots. See Programming Exercise 3.1 on how to solve a quadratic
 equation.
 Write a program that prompts the user to enter values for a, b, and c and displays
 the number of real roots and all real roots.


 soal 3.1

 (Algebra: solve quadratic equations) The two roots of a quadratic equation
 ax2 + bx + c = 0 can be obtained using the following formula:
 r1 =-b + 2b2 - 4ac / 2a
 and r2 =-b - 2b2 - 4ac / 2a

 b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
 equation has two real roots. If it is zero, the equation has one root. If it is negative,
 the equation has no real roots.
 Write a program that prompts the user to enter values for a, b, and c and displays
 the result based on the discriminant. If the discriminant is positive, display two
 roots. If the discriminant is 0, display one root. Otherwise, display “The equation
 has no real roots”.
 Note that you can use Math.pow(x, 0.5) to compute 2x. Here are some
 sample runs.

 Enter a, b, c: 1.0 3 1
 The equation has two roots -0.381966 and -2.61803
 Enter a, b, c: 1 2.0 1
 The equation has one root -1
 Enter a, b, c: 1 2 3
 The equation has no real roots
 */


public class Ex7_25_AlgebraSolveQuadraticEquations {
    public static void main(String[] args) {
        double[] eqn = inputNumber();
        double[] roots = new double[2];

        int result = solveQuadratic(eqn, roots);
        printResult(result,roots);
    }

    public static double[] inputNumber() {
        double[] eqn = new double[3];

        System.out.println("Enter a, b, c: ");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i<eqn.length;i++) {
            eqn[i] = input.nextDouble();
        }
        return eqn;
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
        double discriminant = Math.pow(b,2)-(4*(a*c));

        if (discriminant < 0) {
            return 0;
        }

        roots[0] = (-b + Math.sqrt(discriminant)) / 2 * a;
        roots[1] = (-b - Math.sqrt(discriminant)) / 2 * a;
        if (discriminant > 0){
        return 1;
        }else {
            return 2;
        }
    }

    public static void printResult(int result,double[]root) {

        if (result == 0) {
            System.out.println("The equation has no real root");
        }else if (result == 1){
            System.out.println("The equation has two roots " + root[0] + " and " + root[1]);
        } else if (result == 2) {
            System.out.println("The equation has one roots " + root[1]);
        }
    }
}
