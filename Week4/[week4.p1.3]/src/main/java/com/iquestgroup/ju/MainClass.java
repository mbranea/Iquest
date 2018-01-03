package com.iquestgroup.ju;

public class MainClass {

    public static void main(String args[]) {
        System.out.println(SentenceBuilder.buildSentence());
        for (int counter = 0; counter <= 19; counter++) {
            System.out.println(SentenceBuilder.buildSentence());
        }

    }
}
