package cards.maumau.model;

import cards.Card;
import cards.Suit;

class GameCanceled extends AhState {

    GameCanceled(ActionHandler aH) {
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
