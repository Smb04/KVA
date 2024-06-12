package cards.maumau.model;

import cards.Card;
import cards.Suit;

public class GamePlayed extends AhState {
    private ActionHandler aH;

    GamePlayed(ActionHandler aH) {
        super(aH);
        this.aH = aH;
    }

    @Override
    void skip() {

    }

    @Override
    void chooseSuit(Suit s) {

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
