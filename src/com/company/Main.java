package com.company;

public class Main {

    public static void main(String[] args) {
        CardDeck myDeck = new CardDeck();
        //myDeck.ShowCards();
        myDeck.Shuffle();
        myDeck.ShowCards();
    }
}
