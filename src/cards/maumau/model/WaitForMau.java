package cards.maumau.model;

class WaitForMau extends State {
    private PlayerHandler pH;

    WaitForMau(PlayerHandler pH) {
        super(pH);
        this.pH = pH;
    }

    @Override
    public void mau(Player p) {

    }

    @Override
    public void nextTurn(int n) {
        pH.getRemember().drawCards(1);
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
