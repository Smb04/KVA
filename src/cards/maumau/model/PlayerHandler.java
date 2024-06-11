package cards.maumau.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class PlayerHandler {
    private final MauMau game;
    private final List<Player> players = new LinkedList<>();
    private final List<Player> ranking = new ArrayList<>();
    private State state = new WaitForNextTurn(this);
    private Player remember;

    /**
     * Constructs a PlayerHandler for the specified MauMau game.
     *
     * @param game The MauMau game instance.
     */
    PlayerHandler(MauMau game) {
        this.game = game;
    }

    /**
     * Returns the list of players participating in the game.
     *
     * @return The list of players.
     */
    List<Player> getPlayers() {
        return players;
    }

    /**
     * Returns the ranking of players based on the order they finished the game.
     *
     * @return The ranking of players.
     */
    List<Player> getRanking() {
        return ranking;
    }

    /**
     * Adds a player to the game.
     *
     * @param player The player to add.
     * @throws IllegalArgumentException if a player with the same name already exists.
     */
    void addPlayer(Player player) {
        players.add(player);
    }

    public Player getRemember() {
        return remember;
    }

    void setRemember(Player remember) {
        this.remember = remember;
    }

    /**
     * Moves to the next player's turn in the game.
     *
     * @param n The number of turns to proceed.
     */
    private void localNextTurn(int n) {
        for (int i = 0; i < n; i++) {
            Player p = players.getFirst();
            players.remove(players.getFirst());
            players.addLast(p);
        }
    }

    /**
     * Finishes a player's participation in the game.
     *
     * @param p The player to finish.
     */
    private void finishPlayer(Player p) {
        ranking.add(p);
        players.remove(p);
    }

    /**
     * Returns the current player whose turn it is.
     *
     * @return The current player.
     */
    Player getCurrentPlayer() {
        return players.isEmpty() ? null : players.getFirst();
    }

    void setState(State s) {state = s;}

    /**
     * Initiates the next turn in the game.
     *
     * @param n The number of turns to proceed.
     */
    void nextTurn(int n) {
        state.nextTurn(n);
    }
    /*
        Handles players in a MauMau game.
    */

    /**
     * Handles a player calling "Mau".
     *
     * @param p The player calling "Mau".
     */
    void mau(Player p) {
        state.mau(p);
    }

    /**
     * Handles a player calling "Mau-Mau".
     *
     * @param p The player calling "Mau-Mau".
     */

    void maumau(Player p) {
        state.maumau(p);
    }
}

