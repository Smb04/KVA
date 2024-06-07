package cards;

/**
 * Represents the suits of playing cards.
 */
public enum Suit {
    /**
     * Represents the Hearts suit.
     */
    HEARTS,
    /**
     * Represents the Diamonds suit.
     */
    DIAMONDS,
    /**
     * Represents the Clubs suit.
     */
    CLUBS,
    /**
     * Represents the Spades suit.
     */
    SPADES;

    /**
     * Returns a string representation of the suit.
     *
     * @return A string representing the suit.
     */
    @Override
    public String toString() {

        return switch (Suit.values()[this.ordinal()]) {
            case HEARTS -> "♥".stripTrailing();
            case DIAMONDS -> "♦".stripTrailing();
            case CLUBS -> "♣".stripTrailing();
            case SPADES -> "♠".stripTrailing();
        };
    }
}
