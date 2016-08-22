package chapter6;

/**
 * Created by USER on 8/19/2016.
 */
public class Ex6_32_GameChanceOfWinningAtcraps {
    public static void main(String[]args) {


        for (int win = 0; win < 10;) {
            if (craps() == 1){
                win++;
            }

            System.out.println("Number of winning game is " + win);
        }
    }

    public static int intRandom(int lowerBound, int upperBound) {
        return (int) (lowerBound + Math.random() * (upperBound - lowerBound + 1));
    }

    public static int roll() {
        int dice1 = intRandom(1, 6);
        int dice2 = intRandom(1, 6);
        int sum = dice1 + dice2;

        System.out.println("You roll " + dice1 + " + " + dice2 + " = " + sum);

        return sum;

    }

    public static int craps() {

        int first = 0;
        int status = 0;

        first = roll();
        switch (first) {
            case 2:
            case 3:
            case 12:
                System.out.println("You lose");
                break;
            case 7:
            case 11:
                System.out.println("You win");
                status = 1;
                break;
            default:
                System.out.println("The point is " + first);

                int next;
                do {
                    next = roll();

                } while (!(next == first || next == 7));

                if (next == 7) {
                    System.out.println("You lose");
                    status = -1;
                } else {
                    System.out.println("You win");
                    status = 1;
                }

        }

        return status;

    }
}