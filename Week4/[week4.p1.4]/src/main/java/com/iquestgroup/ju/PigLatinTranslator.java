package com.iquestgroup.ju;

import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Class containing the methods for translation
 */
public class PigLatinTranslator {
    /**
     * Translates the string
     *
     * @param stringToTranslate The string to be translated
     * @return the translation
     */
    public static StringBuilder translate(String stringToTranslate) {
        StringBuilder resultString = new StringBuilder();
        StringTokenizer tokenizer = new StringTokenizer(stringToTranslate);
        while (tokenizer.hasMoreTokens()) {
            resultString.append(wordTranslate(tokenizer.nextToken()));
            resultString.append(" ");
        }
        return resultString;

    }

    /**
     * Translates a single word
     *
     * @param word The word
     * @return The translated word
     */
    private static String wordTranslate(String word) {
        char[] letterArray = word.toCharArray();
        char[] newWord = new char[letterArray.length];
        char aux;
        letterArray = Arrays.copyOf(letterArray, letterArray.length + 1);
        aux = letterArray[0];
        letterArray[0] = Character.MIN_VALUE;
        letterArray[letterArray.length - 1] = aux;

        return String.valueOf(letterArray).concat("ay");

    }

}
