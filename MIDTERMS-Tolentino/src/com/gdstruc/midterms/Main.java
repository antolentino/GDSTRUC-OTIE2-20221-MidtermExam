package com.gdstruc.midterms;

import java.util.Stack;


public class Main {
    public static void main(String[] args) {

        Stack<Card> deck = new Stack<>();

        // push elements
        for (int j = 0; j < 30; j++) {
            deck.push(new Card(j+1));
        }
        System.out.println("Top of Player Deck: "+ deck.peek());

        Stack<Card> discardedPile = new Stack<>();
        Stack<Card> cardOnHand = new Stack<>();

        // Initialize game and setting stacks
        CardStack game = new CardStack();
        game.setPlayerDeck(deck);
        game.setDiscardedPile(discardedPile);
        game.setCardOnHand(cardOnHand);

        // Prints Player Deck with 30 cards
        game.printPlayerDeck(deck);

        game.gameOn();

    }
}
