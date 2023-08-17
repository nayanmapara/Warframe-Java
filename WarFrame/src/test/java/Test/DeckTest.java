package Test;

import com.mycompany.warframe.Card;
import com.mycompany.warframe.Deck;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {

    @Test
    public void testDrawCard() {
        Deck deck = new Deck();
        deck.addCard(new Card("Hearts", 10));
        Card drawnCard = deck.drawCard();
        assertNotNull(drawnCard);
        assertEquals(0, deck.getSize());
    }

    @Test
    public void testDrawCardFromEmptyDeck() {
        Deck deck = new Deck();
        Card drawnCard = deck.drawCard();
        assertNull(drawnCard);
    }

    @Test
    public void testRemoveCard() {
        Deck deck = new Deck();
        Card card = new Card("Diamonds", 5);
        deck.addCard(card);
        deck.removeCard(0);
        assertEquals(0, deck.getSize());
    }
}
