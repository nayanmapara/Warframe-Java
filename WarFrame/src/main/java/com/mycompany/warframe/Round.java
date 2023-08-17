package com.mycompany.warframe;

public class Round {

    private Card player1Card;
    private Card player2Card;

    public Round(Card player1Card, Card player2Card) {
        this.player1Card = player1Card;
        this.player2Card = player2Card;
    }

    public int getResult() {
        return player1Card.getValue() - player2Card.getValue();
    }
}
