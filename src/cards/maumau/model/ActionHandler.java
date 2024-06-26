package cards.maumau.model;

import cards.Card;
import cards.Suit;

class ActionHandler {
    private final MauMau game;
    private AhState state;
    private Suit chosenSuit;
    private int ctr7 = 0;

    /**
     * Constructs an ActionHandler for the specified MauMau game.
     *
     * @param game The MauMau game instance.
     */
    ActionHandler(MauMau game) {
        this.game = game;
        state = new Initialized(this);
    }

    /**
     * Adds the specified player to the game.
     *
     * @param player The player to be added to the game.
     */
    void addPlayer(Player player) {
        if (state instanceof Initialized) {
            state.addPlayer(player);
        }
    }

    /**
     * Manages the actions and state transitions within a MauMau game.
     * <p>
     * Checks if a card can be played by the current player in the current state.
     *
     * @param c The card being played.
     * @return True if the card can be played, false otherwise.
     * <p>
     **/
    boolean canPlay(Card c) {
        if (state instanceof Initialized) {
            return false;
        }
        else if (state instanceof Normal) {
            return true;
        }
        else if (state instanceof SevenChosen) return true;
        else if (state instanceof JackChosen) {return false;}
        else if (state instanceof SuitChosen) return true;
        else return false;
    }

    /**
     * Starts the game.
     */
    void startGame() {
        state.startGame();
    }

    /**
     * Transitions the game state to GAME_OVER.
     */
    void finishGame() {
        state.finishGame();
    }

    /**
     * Transitions the game state to GAME_CANCELED.
     */
    void cancelGame() {
        state.cancelGame();
    }

    /**
     * Handles the player's choice of a card in the current state.
     *
     * @param c The card chosen by the player.
     */
    void chooseCard(Card c) {
        state.chooseCard(c);
    }

    /**
     * Handles the player's choice of a suit in the current state.
     *
     * @param suit The suit chosen by the player.
     */
    void chooseSuit(Suit suit) {
        state.chooseSuit(suit);
    }

    /**
     * Lets the player skip a round.
     **/
    void skip() {
        state.skip();
    }

    /**
     * Handles the player saying "no 7" in the current state.
     */
    void no7() {
        state.no7();
    }

    /**
     * Returns the MauMau game instance associated with this action handler.
     *
     * @return The MauMau game instance.
     */
    MauMau getGame() {
        return game;
    }

    /**
     * Returns the suit chosen by a player after playing a Jack card.
     *
     * @return The chosen suit.
     */
    Suit getChosenSuit() {
        return chosenSuit;
    }

    /**
     * Sets the suit chosen by a player after playing a Jack card.
     *
     * @param chosenSuit The suit chosen by the player.
     */
    void setChosenSuit(Suit chosenSuit) {
        this.chosenSuit = chosenSuit;
    }

    /**
     * Returns the number of number 7 cards played recently.
     *
     * @return The number of number 7 cards played recently.
     */
    int get7Counter() {
        return ctr7;
    }

    /**
     * Resets the counter of number 7 cards played to zero.
     */
    void reset7Counter() {
        ctr7 = 0;
    }

    /**
     * Increments the counter of number 7 cards played by one.
     */
    void increment7Counter() {
        ctr7++;
    }

    AhState getState() {return state;}

    void setState(AhState s) {state = s;}
}
