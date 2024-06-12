package cards;

import org.junit.Test;

import static cards.Suit.CLUBS;
import static cards.Suit.DIAMONDS;
import static cards.Suit.HEARTS;
import static cards.Suit.SPADES;
import static org.junit.Assert.assertEquals;

public class SuitTest {
    @Test
    public void toStringTest() {
        assertEquals("♥", HEARTS.toString().stripTrailing());
        assertEquals("♦", DIAMONDS.toString().stripTrailing());
        assertEquals("♣", CLUBS.toString().stripTrailing());
        assertEquals("♠", SPADES.toString().stripTrailing());
    }
}
