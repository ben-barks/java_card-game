import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards;
    private ArrayList<Card> dealtCards;


    public Deck(){
        this.cards = new ArrayList<>();
        this.dealtCards = new ArrayList<>();

    }

    public int getCards() {
        return cards.size();
    }

    public int countCards() {
        return dealtCards.size();
    }

    public void populateDeck(){
        for (RankType rank : RankType.values()){
            for (SuitType suit : SuitType.values()){
              Card card = new Card(suit, rank);
              cards.add(card);
            }
        }
    }

    public void shuffleCards(){
        Collections.shuffle(cards);
    }

    public Card cardByIndex(){
        return cards.get(0);
    }

    public int dealtCardValueByIndex(int index){
        return dealtCards.get(index).getValueFromEnum();
    }

    public void dealCard(){
        Random rand = new Random();
        Card randomCard = cards.get(rand.nextInt(cards.size()));
        dealtCards.add(randomCard);
    }
}
