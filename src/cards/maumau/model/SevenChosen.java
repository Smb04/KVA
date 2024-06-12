package cards.maumau.model;

import cards.Card;
import cards.Suit;

class SevenChosen extends AhState {
    private ActionHandler aH;

    SevenChosen(ActionHandler aH) {
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
        if (aH.canPlay(c)) {
            aH.getGame().getPlayerHandler().getCurrentPlayer().playCard(c);
            aH.increment7Counter();
            aH.getGame().getPlayerHandler().nextTurn(1);
        }
        else aH.setState(new SevenChosen(aH));
    }

    @Override
    void no7() {
        aH.getGame().getPlayerHandler().getCurrentPlayer().drawCards(2 * aH.get7Counter());
        aH.reset7Counter();
        aH.setState(new Normal(aH));
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
