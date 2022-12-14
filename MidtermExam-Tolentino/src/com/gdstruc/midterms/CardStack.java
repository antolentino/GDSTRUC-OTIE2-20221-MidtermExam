package com.gdstruc.midterms;
import java.util.*;

public class CardStack {
    private Stack<Card> playerDeck;
    private Stack<Card> discardedPile;
    private Stack<Card> cardOnHand;


    public void draw(Card card){
        cardOnHand.push(card);
    }

    public void discard(Card card) {
        discardedPile.push(card);
    }

    public boolean isEmpty() {
        return playerDeck.isEmpty();
    }


    public void printPlayerDeck(Stack<Card> stack) {
        System.out.println("CURRENT Deck: ");

        ListIterator<Card> iterator = this.playerDeck.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public Stack<Card> getCardOnHand() {
        return cardOnHand;
    }

    public void setCardOnHand(Stack<Card> cardOnHand) {
        this.cardOnHand = cardOnHand;
    }

    public Stack<Card> getPlayerDeck() {
        return playerDeck;
    }

    public void setPlayerDeck(Stack<Card> playerDeck) {
        this.playerDeck = playerDeck;
    }

    public Stack<Card> getDiscardedPile() {
        return discardedPile;
    }

    public void setDiscardedPile(Stack<Card> discardedPile) {
        this.discardedPile = discardedPile;
    }
    private void pressEnterToContinue()
    {
        System.out.println("Press ENTER to continue...");
        try{System.in.read();}
        catch(Exception e){}
    }

    public void gameOn(){
        Stack<Card> discardedPile = new Stack<>();
        Stack<Card> cardOnHand = new Stack<>();
        // Initialize game and setting stacks
        CardStack game = new CardStack();
        game.setPlayerDeck(playerDeck);
        game.setDiscardedPile(discardedPile);
        game.setCardOnHand(cardOnHand);

        while (!game.isEmpty()) {
            System.out.println("\nCard/s on hand: \n" + game.getCardOnHand());
            System.out.println("Number of cards in the deck: \n" + game.getPlayerDeck().size());
            System.out.println("Number of cards in the discarded pile: \n" + game.getDiscardedPile().size()
                    + " " + game.getDiscardedPile());

            System.out.println("INPUT commands: 1 to draw, 2 to discard, 3 to get card from discard pile");
            Random rand = new Random();
            int command = rand.nextInt(3)+1;
            System.out.println("Command: "+ command);
            int cardNum = rand.nextInt(5)+1;
            if (command == 1) {
                System.out.println("Input number of cards from 1-5 to draw: "+ cardNum + "\n");
                if (cardNum <= game.getPlayerDeck().size() && cardNum <=5) {
                    for (int i = 0; i < cardNum; i++) {
                        game.draw(game.getPlayerDeck().pop());
                    }
                } else {
                    for (int i =0; i <3; i++) {
                        System.out.println("PLEASE ENTER NO. ACCORDING TO CURRENT QUANTITY OF DECK.");
                    }
                    continue;
                }
                pressEnterToContinue();
            } else if (command == 2) {
                System.out.println("Input number of cards from 1-5 to discard: " + cardNum);

                if (cardNum <= game.getCardOnHand().size() && cardNum <=5) {
                    for (int i = 0; i < cardNum; i++) {
                        game.discard(game.getCardOnHand().pop());
                    }
                } else {
                    for (int i =0; i <3; i++) {
                        System.out.println("PLEASE ENTER NO. ACCORDING TO CURRENT QUANTITY OF CARD ON HAND.");
                    }
                    continue;
                }
                pressEnterToContinue();
            } else if (command == 3) {
                System.out.println("Input number of cards from 1-5 to get from discard pile: "+ cardNum +"\n");
                if (cardNum <= game.getDiscardedPile().size() && cardNum <=5) {
                    for (int i = 0; i < cardNum; i++) {
                        game.draw(game.getDiscardedPile().pop());
                    }
                }
                else {
                    for (int i =0; i <3; i++) {
                        System.out.println("PLEASE ENTER NO. ACCORDING TO CURRENT QUANTITY OF PILE.");
                    }
                    continue;
                }
                pressEnterToContinue();
            }
            else {
                for (int i =0; i <3; i++) {
                    System.out.println("ERROR. Try again. ");
                }
                continue;
            }
        }
        if (game.isEmpty()){
            for (int i =0; i <3; i++) {
                System.out.println("PLAYER DECK IS NOW EMPTY. GAME ENDED.");
            }
            System.out.println("\nCard/s on hand: \n" + game.getCardOnHand());
            System.out.println("Number of cards in the deck: \n" + game.getPlayerDeck().size());
            System.out.println("Number of cards in the discarded pile: \n" + game.getDiscardedPile().size()
                    + " " + game.getDiscardedPile());
            return;
        }
   }
}