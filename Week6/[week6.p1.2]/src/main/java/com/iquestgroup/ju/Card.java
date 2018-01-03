package com.iquestgroup.ju;

public class Card {

    private int nRank; // Used later
    private int maxRank = 13; //The max number of Ranks
    public String[] ranks = new String[maxRank];
    private int nSuit; // Used later
    private int maxSuit = 4; // Max number of suits
    public String[] suits = new String[maxSuit];

    {
        ranks[0] = "two";
        ranks[1] = "three";
        ranks[2] = "four";
        ranks[3] = "five";
        ranks[4] = "six";
        ranks[5] = "seven";
        ranks[6] = "eight";
        ranks[7] = "nine";
        ranks[8] = "ten";
        ranks[9] = "Jack";
        ranks[10] = "Queen";
        ranks[11] = "King";
        ranks[12] = "Ace";

    }

    {
        suits[0] = "Clubs";
        suits[1] = "Diamonds";
        suits[2] = "Spades";
        suits[3] = "Hearts";
    }

    //Constructor for the Card object, with two arguments, x for rank, y for suit
    public Card(int x, int y) {
        this.nRank = x;
        this.nSuit = y;
    }

    public int getRank() {
        return nRank;
    }

    public int getSuit() {
        return nSuit;
    }

    @Override
    public String toString() {
        return "Suit " + nSuit + " Number " + nRank;
    }
}
