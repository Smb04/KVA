package cards.maumau.model;

import cards.Card;
import cards.Suit;

class JackChosen extends AhState {
    private ActionHandler aH;

    JackChosen(ActionHandler aH) {
        super(aH);
        this.aH = aH;
    }

    @Override
    void skip() {

    }

    @Override
    void chooseSuit(Suit s) {
        aH.setChosenSuit(s);
        aH.getGame().getPlayerHandler().nextTurn(1);
        aH.setState(new SuitChosen(aH));
    }

    @Override
    void chooseCard(Card c) {

    }

    @Override
    void no7() {

    }

    @Override
    void startGame() {

    }

    @Override
    void cancelGame() {

    }

    @Override
    void finishGame() {

    }

    @Override
    void addPlayer(Player p) {

    }
}
