package chapter4;

import java.util.Scanner;

/**
 * Created by USER on 6/27/2016.
 */
public class Ex4_18_StudentMajorAndStatus {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two characters:");
        String in = input.nextLine();

        char major = in.charAt(0);
        char level = in.charAt(1);

        String Majors = "";
        String Levels = "";

        switch (major) {
            case 'M':
                Majors = "Mathematics";
                break;

            case 'C':
                Majors = "Computer Science";
                break;

            case 'I':
                Majors = "Information Technology";
                break;

            default:
                System.out.println("Invalid input");
                System.exit(0);
                break;
        }

        switch (level) {
            case '1':
                Levels = "freshman";
                break;

            case '2':
                Levels = "sophomore";
                break;

            case '3':
                Levels = "junior";
                break;

            case '4':
                Levels = "senior";
                break;

            default:
                System.out.println("Invalid input");
                System.exit(0);
                break;
        }
        System.out.println(Majors + " " + Levels);

    }
}
