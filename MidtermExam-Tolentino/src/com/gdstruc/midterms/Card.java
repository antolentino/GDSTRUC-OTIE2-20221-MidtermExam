package com.gdstruc.midterms;

public class Card {
    private int cardNum;

    public Card(int cardName) {
        this.cardNum = cardName;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardName='" + cardNum + '\'' +
                '}';
    }

}


