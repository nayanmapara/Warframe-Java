package com.mycompany.warframe;

import java.util.ArrayList;
import java.util.Scanner;

public class WarFrame extends Game {

    private Deck deck;
    private Player player1;
    private Player player2;
    private ArrayList<Round> rounds;

    public WarFrame(String name) {
        super(name);
        deck = new Deck();
        player1 = new Player("Player 1");
        player2 = new Player("Player 2");
        rounds = new ArrayList<>();
    }

    @Override
    public void play() {
        initializeDeck();
        shuffleDeck();
        dealCards();

        Scanner scanner = new Scanner(System.in);
        while (player1.getHandSize() > 0 && player2.getHandSize() > 0) {
            Card player1Card = player1.drawCard();
            Card player2Card = player2.drawCard();

            Round round = new Round(player1Card, player2Card);
            rounds.add(round);
            player1.addRoundPlayed(round);
            player2.addRoundPlayed(round);

            System.out.println(player1.getName() + " plays: " + player1Card);
            System.out.println(player2.getName() + " plays: " + player2Card);

            if (round.getResult() > 0) {
                player1.addToHand(player1Card);
                player1.addToHand(player2Card);
                System.out.println(player1.getName() + " wins the round!");
            } else if (round.getResult() < 0) {
                player2.addToHand(player1Card);
                player2.addToHand(player2Card);
                System.out.println(player2.getName() + " wins the round!");
            } else {
                System.out.println("It's a tie!");
            }

            System.out.println("Press Enter to continue to the next round...");
            scanner.nextLine();
        }

        declareWinner();
    }

    private void initializeDeck() {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        int[] values = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };

        for (String suit : suits) {
            for (int value : values) {
                deck.addCard(new Card(suit, value));
            }
        }
    }

    private void shuffleDeck() {
        deck.shuffle();
    }

    private void dealCards() {
        int totalCards = deck.getSize();
        int halfCards = totalCards / 2;

        for (int i = 0; i < halfCards; i++) {
            player1.addToHand(deck.drawCard());
        }

        for (int i = halfCards; i < totalCards; i++) {
            player2.addToHand(deck.drawCard());
        }
    }

    @Override
    public void declareWinner() {
        if (player1.getHandSize() > player2.getHandSize()) {
            System.out.println(player1.getName() + " wins the game!");
        } else if (player1.getHandSize() < player2.getHandSize()) {
            System.out.println(player2.getName() + " wins the game!");
        } else {
            System.out.println("The game is a tie!");
        }
    }

    public static void main(String[] args) {
        WarFrame warFrame = new WarFrame("War Card Game");
        warFrame.play();
    }
}
