package cards.maumau.model;

import cards.Suit;
import cards.Card;

 class SuitChosen extends AhState{
    SuitChosen(ActionHandler aH) {
        super(aH);
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
