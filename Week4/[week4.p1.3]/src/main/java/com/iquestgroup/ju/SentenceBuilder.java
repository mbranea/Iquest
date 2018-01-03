package com.iquestgroup.ju;

import org.apache.commons.lang3.text.WordUtils;

import java.util.Random;

/**
 * Class containing the method for sentence building
 */
public class SentenceBuilder {


    /**
     * Builds the random sentence
     *
     * @return the sentence
     */
    public static String buildSentence() {
        String[] articleArray = {"the", "a", "one", "some", "any"};
        String[] nounArray = {"boy", "girl", "dog", "town", "car"};
        String[] verbArray = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] prepositionsArray = {"to", "from", "over", "under", "on"};


        Random random = new Random();
        StringBuilder sentence = new StringBuilder();
        sentence.append(WordUtils.capitalize(articleArray[random.nextInt(4)]));
        sentence.append(" ");
        sentence.append(nounArray[random.nextInt(4)]);
        sentence.append(" ");
        sentence.append(verbArray[random.nextInt(4)]);
        sentence.append(" ");
        sentence.append(prepositionsArray[random.nextInt(4)]);
        sentence.append(" ");
        sentence.append(articleArray[random.nextInt(4)]);
        sentence.append(" ");
        sentence.append(nounArray[random.nextInt(4)]);
        sentence.append(".");
        return sentence.toString();
    }
}
