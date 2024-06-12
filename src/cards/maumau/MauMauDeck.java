package cards.maumau;

import cards.Card;
import cards.Rank;
import cards.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

/**
 * Represents a deck of cards used in the Mau-Mau game.
 */
public class MauMauDeck {
    /**
     * Private constructor to prevent instantiation of this class.
     */
    private MauMauDeck() { /* do nothing */ }

    /**
     * Generates a deck of Mau-Mau cards and shuffles it.
     *
     * @param numDecks Number of decks to be included in the game.
     * @return A list containing the generated deck of cards.
     */
    public static List<Card> makeDeck(int numDecks) {
        List<Card> deck = new ArrayList<Card>();
        for (int i = 0; i != numDecks; i++) {
            for (Rank rank : EnumSet.range(Rank.SEVEN, Rank.ACE)) {
                for (Suit suit : Suit.values()) {
                    Card newCard = new Card(rank, suit);
                    deck.add(newCard);
                }
            }
        }
        Collections.shuffle(deck);
        return deck;
    }
}
