package cards.maumau.model;

class WaitForNextTurn extends State {
    private PlayerHandler pH;

    public WaitForNextTurn(PlayerHandler pH) {
        super(pH);
        this.pH = pH;
    }

    @Override
    public void nextTurn(int n) {
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
    public void mau(Player p) {
        if (p == pH.getRemember()) {
            pH.setState(new WaitForNextTurn(pH));
        }
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
