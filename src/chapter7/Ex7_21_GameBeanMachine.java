package chapter7;
import java.util.Scanner;

/**
 * Created by USER on 9/5/2016.
 * (Game: bean machine) The bean machine, also known as a quincunx or the Galton
 box, is a device for statistics experiments named after English scientist Sir
 Francis Galton. It consists of an upright board with evenly spaced nails (or pegs)
 in a triangular form, as shown in Figure 7.13.
 Balls are dropped from the opening of the board. Every time a ball hits a nail, it
 has a 50% chance of falling to the left or to the right. The piles of balls are accumulated
 in the slots at the bottom of the board.
 Write a program that simulates the bean machine. Your program should prompt
 the user to enter the number of the balls and the number of the slots in the machine.
 Simulate the falling of each ball by printing its path. For example, the path for
 the ball in Figure 7.13b is LLRRLLR and the path for the ball in Figure 7.13c is
 (Hint: Create an array named slots. Each element in slots stores the number
 of balls in a slot. Each ball falls into a slot via a path. The number of Rs in
 a path is the position of the slot where the ball falls. For example, for the path
 LRLRLRR, the ball falls into slots[4], and for the path is RRLLLLL, the ball
 falls into slots[2].)
 */


public class Ex7_21_GameBeanMachine {
    public static void main(String[] args) {

        int drops = inputBall();
        int pin = inputSlot();

        String[] paths = new String[pin * drops];
        int[] balls = new int[pin];

        countR(paths,balls,pin);
        print(paths, pin);
        print(balls);
    }

    public static int inputBall() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int drops = input.nextInt();

        return drops;
    }

    public static int inputSlot() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of slots in the bean machine: ");
        int pin = input.nextInt() - 1;

        return pin;
    }

    public static void countR(String[]paths,int[]balls,int pin) {
        int numberOfRs = 0;
        for (int i = 0; i < paths.length; i++) {
            paths[i] = getRandomMovement();

            if (paths[i] == "R") {
                numberOfRs++;
            }
            if ((i + 1) % pin == 0) {
                balls[numberOfRs]++;
                numberOfRs = 0;
            }
        }
    }

    public static String getRandomMovement() {
        if ((int)(Math.random() * 2) == 0)
            return "L";
        else
            return "R";
    }

    public static void print(String[] list, int pin) {
        System.out.println();
        for (int i = 0; i < list.length; i++) {
            if ((i + 1) % pin == 0) {
                System.out.print(list[i] + "\n");
            } else {
                System.out.print(list[i]);
            }
        }
    }

    public static void print(int[] list) {
        int max = max(list);
        while (max > 0) {
            System.out.println();
            for (int i = 0; i < list.length; i++) {
                if (list[i] >= max) {
                    System.out.print("O");
                }
                else
                    System.out.print(" ");
            }
            max--;
        }
        System.out.println();
    }

    public static int max(int[] list) {
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];

            }
        }
        return max;
    }
}