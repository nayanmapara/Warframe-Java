package com.mycompany.warframe;

// Card.java


/**
 * A class to represent a playing card.
 * Each card has a suit and a value.
 * The suit can be Hearts, Diamonds, Clubs, or Spades.
 * The value can range from 2 to 14 (11 = Jack, 12 = Queen, 13 = King, 14 = Ace).
 * The card's value determines its rank in the game.
 * For this implementation, we assume that higher values represent higher ranks.
 * @author dancye
 */
public class Card {

    private final String suit;
    private final int value;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value + " of " + suit;
    }
}
