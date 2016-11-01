package chapter7;
/**
 * Created by USER on 10/24/2016.
 *
 *
 *
 *
 *
 * (Game: locker puzzle) A school has 100 lockers and 100 students. All lockers are
 closed on the first day of school. As the students enter, the first student, denoted
 S1, opens every locker. Then the second student, S2, begins with the second
 locker, denoted L2, and closes every other locker. Student S3 begins with the
 third locker and changes every third locker (closes it if it was open, and opens it if
 it was closed). Student S4 begins with locker L4 and changes every fourth locker.
 Student S5 starts with L5 and changes every fifth locker, and so on, until student
 S100 changes L100.
 After all the students have passed through the building and changed the lockers,
 which lockers are open? Write a program to find your answer and display all
 open locker numbers separated by exactly one space.
 (Hint: Use an array of 100 Boolean elements, each of which indicates whether a
 locker is open (true) or closed (false). Initially, all lockers are closed.)


 */
public class Ex7_23_GameLockerPuzzle {
    public static void main(String[] args) {
        boolean[] locker = new boolean[101];

        print(locker);


    }

    public static void beforePresent(boolean[] locker) {
        for (int i = 0; i < locker.length; i++) {
            if (i % 8 == 0) {
                System.out.println();
            }else
            System.out.print(" close ");
        }
    }

    public static void firstStudent(boolean[] locker) {
        System.out.println();
        for (int i = 0; i < locker.length; i++) {
            if (i % 9 == 0) {
                System.out.println();
            }else{
                System.out.print(" open ");
            }
        }
    }

    public static void secondStudent(boolean[] locker) {
        System.out.println();
        for (int i = 0; i < locker.length; i++) {
            if (i % 9 == 0) {
                System.out.println();
            }else {
                if (i <= 2) {
                    System.out.print(" open ");
                } else {
                    System.out.print(" close ");
                }
            }
        }
    }

    public static void studentPresent(boolean[] locker) {
        System.out.println();
        System.out.print("\n locker open :");
        for (int student = 0; student < locker.length; student++) {
            locker[student] = !locker[student];
        }
        for (int i = 0; i < locker.length; i++) {
            if (i % 9 == 0) {
                System.out.println();
            }else {
                if (locker[i]) {
                    System.out.print(" open ");
                } else{
                    System.out.print(" close ");
                }
            }
        }
    }

    public static void print(boolean[] locker) {
        beforePresent(locker);
        firstStudent(locker);
        secondStudent(locker);
        studentPresent(locker);
    }

}