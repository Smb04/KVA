package cards.maumau.model;

abstract class State {
    final PlayerHandler playerHandler;

    State(PlayerHandler pH) {
        this.playerHandler = pH;
    }

    abstract void mau(Player p);

    abstract void nextTurn(int n);

    abstract void maumau(Player p);

    abstract void finishGame();

    abstract void finishPlayer(Player p);

    abstract void localNextTurn(int n);
}
