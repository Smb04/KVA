package cards.maumau.model;

import cards.Card;
import cards.Suit;

abstract class AhState {
    final ActionHandler aH;

    AhState(ActionHandler aH) {
        this.aH = aH;
    }

    abstract void skip();

    abstract void chooseSuit(Suit s);

    abstract void chooseCard(Card c);

    abstract void no7();

    abstract void startGame();

    abstract void cancelGame();

    abstract void finishGame();

    abstract void addPlayer(Player p);
}
