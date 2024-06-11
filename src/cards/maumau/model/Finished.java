package cards.maumau.model;

class Finished extends State {
    private PlayerHandler pH;

    Finished(PlayerHandler pH) {
        super(pH);
        this.pH = pH;
    }

    @Override
    void mau(Player p) {

    }

    @Override
    void nextTurn(int n) {

    }

    @Override
    void maumau(Player p) {

    }

    @Override
    void finishGame() {

    }

    @Override
    void finishPlayer(Player p) {

    }

    @Override
    void localNextTurn(int n) {

    }
}
