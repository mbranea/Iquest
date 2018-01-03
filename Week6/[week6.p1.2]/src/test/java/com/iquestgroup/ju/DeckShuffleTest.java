package com.iquestgroup.ju;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DeckShuffleTest {
    /**
     * The test adds 5 shuffled variations of the deck to a list and then checks for duplicates to prove the decks are different.
     */
    @Test
    public void shuffleTest() {
        ArrayList<Deck> decks = new ArrayList<Deck>();
        ArrayList<Card> emptyCardList = new ArrayList();
        Deck deck = new Deck(emptyCardList);
        ArrayList intermediaryDeck = new ArrayList();
        intermediaryDeck = deck.getCards();
        Collections.shuffle(intermediaryDeck);
        decks.add(new Deck(intermediaryDeck));
        Collections.shuffle(intermediaryDeck);
        decks.add(new Deck(intermediaryDeck));
        Collections.shuffle(intermediaryDeck);
        decks.add(new Deck(intermediaryDeck));
        Collections.shuffle(intermediaryDeck);
        decks.add(new Deck(intermediaryDeck));
        Collections.shuffle(intermediaryDeck);
        decks.add(new Deck(intermediaryDeck));
        assertTrue(crosscheck(decks));
    }

    /**
     * Checks if the decks in the list are different from one another
     *
     * @param list The list of decks
     * @return true if they are different
     */
    private boolean crosscheck(ArrayList<Deck> list) {
        Set<Deck> deck = new HashSet<Deck>(list);
        if (deck.size() == list.size()) {
            return true;
        }
        return false;
    }

}

