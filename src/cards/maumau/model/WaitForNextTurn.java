package cards.maumau.model;

class WaitForNextTurn extends State {
    private PlayerHandler pH;

    WaitForNextTurn(PlayerHandler pH) {
        super(pH);
        this.pH = pH;
    }

    @Override
    void nextTurn(int n) {
        if (pH.getCurrentPlayer().getCards().size() == 1) {
            pH.setRemember(pH.getCurrentPlayer());
            localNextTurn(n);
        }
        else if (pH.getCurrentPlayer().getCards().isEmpty()) {
            pH.setRemember(pH.getCurrentPlayer());
            localNextTurn(n);
        }
        else {
            localNextTurn(n);
        }
    }

    @Override
    void mau(Player p) {

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
