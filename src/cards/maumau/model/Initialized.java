package cards.maumau.model;

import cards.Suit;
import cards.Card;

class Initialized extends AhState {
    private ActionHandler aH;

    Initialized(ActionHandler aH) {
        super(aH);
        this.aH = aH;
    }

    @Override
    void skip() {

    }

    @Override
    void chooseSuit(Suit suit) {

    }

    @Override
    void chooseCard(Card c) {

    }

    @Override
    void no7() {

    }

    @Override
    void startGame() {
        aH.getGame().getCardHandler().dealCards();
    }

    @Override
    void cancelGame() {

    }

    @Override
    void finishGame() {

    }

    @Override
    void addPlayer(Player p) {
        aH.getGame().getPlayerHandler().addPlayer(p);
    }
}
