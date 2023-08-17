package com.mycompany.warframe;

import java.util.ArrayList;

public class Player {

    private String name;
    private Deck hand;
    private ArrayList<Round> roundsPlayed;

    public Player(String name) {
        this.name = name;
        this.hand = new Deck();
        this.roundsPlayed = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Deck getHand() {
        return hand;
    }

    public Card drawCard() {
        return hand.drawCard();
    }

    public void addToHand(Card card) {
        hand.addCard(card);
    }

    public void removeFromHand(int index) {
        hand.removeCard(index);
    }

    public int getHandSize() {
        return hand.getSize();
    }

    public void addRoundPlayed(Round round) {
        roundsPlayed.add(round);
    }

    public ArrayList<Round> getRoundsPlayed() {
        return roundsPlayed;
    }
}
