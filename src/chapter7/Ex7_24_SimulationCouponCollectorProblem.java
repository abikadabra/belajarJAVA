package chapter7;

/**
 * Created by USER on 10/26/2016.
 */
public class Ex7_24_SimulationCouponCollectorProblem {
    public static void main(String[] args) {
        int[] deck = new int[52];
        int[] card = new int[4];

        setCard(deck);
        shuffleDeck(deck);

        int count = 0;
        do {
            pickCard(deck, card);
            count++;
        } while (!sameSuit(card));
        print(card);

        System.out.println("Number of picks :"+ count);
    }

    //set kartunya
    public static int setCard(int[] deck) {
        int set = 0;
        for (int i = 0; i < deck.length; i++) {
            set = deck[i] = i;
        }
        return set;
    }

    //shuffle decknya
    public static void shuffleDeck(int[] deck) {
        int index;
        int temp;
        for (int i = 0; i < deck.length; i++) {
            index = pickCard(deck);
            temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }

    //ngambil 4 kartu dari deck
    public static void pickCard(int[] deck, int[] card) {
        for (int i = 0; i < card.length; i++) {
            card[i] = deck[pickCard(deck)];
        }
    }

    //random ambil kartu
    public static int pickCard(int[] deck) {
        return (int) (Math.random() * deck.length);
    }

    //cek kalo bentuk kartu sama
    public static boolean sameSuit(int[] card) {
        for (int i = 0; i < card.length;i++) {
            for (int j = 0; j < card.length; j++) {
                if (i != j && (card[i] / 13 == card[j] / 13)) {
                    return false;
                }
            }

        }
        return true;
    }


    //print kartu yang di dapat
    public static void print(int[] card) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "6", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < card.length; i++) {
            System.out.println(ranks[card[i]%13] + " of " + suits[card[i]/13]);
        }
    }
}

