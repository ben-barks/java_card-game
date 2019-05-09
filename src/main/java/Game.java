public class Game {

    private Deck deck;

    public Game() {
        this.deck = deck;
    }

    public String deal(){
//        deck.populateDeck();
        deck.dealCard();
        deck.dealCard();
        if (deck.dealtCardValueByIndex(0) > deck.dealtCardValueByIndex(1)){
            return "Player 1 wins!";
        }
        else if(deck.dealtCardValueByIndex(0) == deck.dealtCardValueByIndex(1)){
            return "It's a tie!";
        }
        else {
            return "Player 2 wins!";
        }
    }
}
