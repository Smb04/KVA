package cards.maumau.model;

class WaitForMauMau extends State {
    private PlayerHandler pH;

    WaitForMauMau(PlayerHandler pH) {
        super(pH);
        this.pH = pH;
    }

    @Override
    void mau(Player p) {

    }

    @Override
    void nextTurn(int n) {
        pH.getRemember().drawCards(1);
    }

    @Override
    void maumau(Player p) {
        if (p == pH.getRemember()) {
            finishPlayer(p);
        }
        if (pH.getPlayers().size() == 1) {
            finishGame();
        }
        else pH.setState(new WaitForNextTurn(pH));
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
