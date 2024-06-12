package cards.maumau.model;

import cards.Card;
import cards.Rank;
import cards.Suit;

class SuitChosen extends AhState {
    private ActionHandler aH;


    SuitChosen(ActionHandler aH) {
        super(aH);
        this.aH = aH;

    }

    @Override
    void skip() {
        aH.getGame().getPlayerHandler().getCurrentPlayer().drawCards(1);
        aH.getGame().getPlayerHandler().nextTurn(1);
    }

    @Override
    void chooseSuit(Suit suit) {

    }

    @Override
    void chooseCard(Card c) {
        if (aH.canPlay(c)) {
            aH.setChosenSuit(null);
            aH.getGame().getPlayerHandler().getCurrentPlayer().playCard(c);
            if (c.rank() == Rank.SEVEN) {
                aH.increment7Counter();
                aH.getGame().getPlayerHandler().nextTurn(1);
                aH.setState(new SevenChosen(aH));
            }
            else if (c.rank() == Rank.EIGHT) {
                aH.getGame().getPlayerHandler().nextTurn(2);
                aH.setState(new Normal(aH));
            }
            else {
                aH.getGame().getPlayerHandler().nextTurn(1);
                aH.setState(new Normal(aH));
            }
        }
        else aH.setState(new SuitChosen(aH));
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
