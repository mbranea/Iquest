package com.iquestgroup.ju;

import java.util.ArrayList;

public class Deck {

    private static int nRanks = 13; //number of ranks
    private static int nSuits = 4; // number of suits
    private static int nCard = nRanks * nSuits; // number of cards
    int counter = 0; //a variable to control the place of each card in the array
    private ArrayList<Card> cards = new ArrayList<Card>();
    //constructor for the Deck
    public Deck(ArrayList<Card> cards) {
        this.cards = cards;
        while (counter < 52) { // loop until there are 52 cards


            for (int i = 0; i <= nRanks - 1; i++) {

                for (int j = 0; j <= nSuits - 1; j++) {

                    cards.add(new Card(i, j)); // creation of the card
                    counter++; // adds 1 to to h so the program knows how many cards are there
                }
            }

        }
    }

    public ArrayList<Card> getCards() {
        return cards;
    }


}