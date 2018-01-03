package com.iquestint.util;

import org.apache.commons.lang.WordUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class implementing the Titlelizer interface
 */
public class ActualTitelizer implements Titlelizer {

    private List<String> ignoreList = new ArrayList<String>(Arrays.asList(new String[]{"the", "a", "to", "in", "of", "is"}));

    /**
     * The method that does the titlezing
     *
     * @param toTitlelize The string to be worked on
     * @return The resulting string
     */
    public String titlelize(String toTitlelize) {
        if (toTitlelize == null) {
            throw new IllegalArgumentException();
        }
        StringBuilder resultString = new StringBuilder();
        List<String> wordList = Arrays.asList(toTitlelize.split("\\s"));


        for (String word : wordList) {
            if (!ignoreList.contains(word)) {
                resultString.append(WordUtils.capitalizeFully(word));
                resultString.append(" ");


            } else {
                resultString.append(word);
                resultString.append(" ");
            }


        }
        resultString.deleteCharAt(resultString.length() - 1);
        return resultString.toString();
    }
}
