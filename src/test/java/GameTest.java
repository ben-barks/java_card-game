import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game;
    Deck deck;

    @Before
    public void before(){
        game = new Game();
        deck = new Deck();
    }

    @Test
    public void canPlay(){
        deck.populateDeck();
        assertEquals("Player 1 wins!", game.deal());
    }
}
