package cards.maumau.model;

class Finished extends State {
    private PlayerHandler pH;

    Finished(PlayerHandler pH) {
        super(pH);
        this.pH = pH;
        String s = "TEST";
    }

    @Override
    public void mau(Player p) {

    }

    @Override
    public void nextTurn(int n) {

    }

    @Override
    public void maumau(Player p) {

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
