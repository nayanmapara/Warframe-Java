package Test;

import com.mycompany.warframe.Card;
import com.mycompany.warframe.Player;
import com.mycompany.warframe.Round;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    public void testDrawCard() {
        Player player = new Player("Player 1");
        Card card = new Card("Spades", 7);
        player.addToHand(card);
        Card drawnCard = player.drawCard();
        assertNotNull(drawnCard);
        assertEquals(0, player.getHandSize());
    }

    @Test
    public void testAddToHand() {
        Player player = new Player("Player 2");
        Card card = new Card("Clubs", 3);
        player.addToHand(card);
        assertEquals(1, player.getHandSize());
    }

    @Test
    public void testRemoveFromHand() {
        Player player = new Player("Player 3");
        Card card = new Card("Hearts", 12);
        player.addToHand(card);
        player.removeFromHand(0);
        assertEquals(0, player.getHandSize());
    }

    @Test
    public void testGetRoundsPlayed() {
        Player player = new Player("Player 4");
        Round round = new Round(new Card("Diamonds", 8), new Card("Spades", 5));
        player.addRoundPlayed(round);
        assertEquals(1, player.getRoundsPlayed().size());
    }
}
