/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Test;

import com.mycompany.warframe.Card;
import com.mycompany.warframe.Round;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoundTest {

    @Test
    public void testGetResult() {
        Card player1Card = new Card("Hearts", 10);
        Card player2Card = new Card("Diamonds", 7);
        Round round = new Round(player1Card, player2Card);
        int result = round.getResult();
        assertEquals(3, result);
    }
}
