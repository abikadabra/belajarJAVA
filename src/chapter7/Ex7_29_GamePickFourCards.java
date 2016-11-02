
package chapter7;
/**
 * Created by USER on 11/2/2016.
 *
 *
 * (Game: pick four cards) Write a program that picks four cards from a deck of 52
 cards and computes their sum. An Ace, King, Queen, and Jack represent 1, 13,
 12, and 11, respectively. Your program should display the number of picks that
 yields the sum of 24.
 */

public class Ex7_29_GamePickFourCards {
    public static void main(String[] args) {
        int sum = 0;
        int countCard = 0;
        String[] cards = new String[4];

        while (sum != 24 || countCard != 4) {
            if (sum > 24 || countCard > 3) {
                countCard = 0;
                sum = 0;
            } else {
                int suitIndex = getSuit();
                int rankIndex = getRank();

                cards[countCard] = getCardShape(rankIndex, suitIndex);
                sum = sum + rankIndex + 1;
                countCard++;
            }
        }

        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);
        }
        System.out.println("sum = " + sum);
    }

    public static int getSuit() {
        return (int) (Math.random() * 52) / 13;
    }

    public static int getRank() {
        return (int) (Math.random() * 52) % 13;
    }

    public static String getCardShape(int rankIndex, int suitIndex) {
        String[] suit = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] rank = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        return rank[rankIndex] + " of " + suit[suitIndex];
    }
}