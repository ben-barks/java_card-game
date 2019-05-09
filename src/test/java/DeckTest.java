import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.SPADES, RankType.QUEEN);
    }

    @Test
    public void isEmpty(){
        assertEquals(0, deck.getCards());
    }

    @Test
    public void canPopulate(){
        deck.populateDeck();
        assertEquals(52, deck.getCards());
    }

    @Test
    public void canShuffle(){
        deck.populateDeck();
        System.out.println(deck.cardByIndex());
        deck.shuffleCards();
        System.out.println(deck.cardByIndex());
    }

    @Test
    public  void canDealOne(){
        deck.populateDeck();
        deck.dealCard();
        assertEquals(1, deck.countCards());
    }


}
