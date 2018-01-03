package com.iquestgroup.remotelearning.w2.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * The class holding the representation of the name
 */
public class Name {
    private String lastName;
    private List<String> firstNameList;

    public Name(String lastName, String name) {
        this.lastName = lastName;
        this.firstNameList = Arrays.asList(name.split(" "));

    }

    public Name(String fullName) {
        if (!fullName == null) {
            List<String> nameElements = Arrays.asList(fullName.split(" "));
            this.lastName = nameElements.get(0);
            ArrayList<String> nameElementsArray = new ArrayList<>(nameElements);
            nameElementsArray.remove(0);
            this.firstNameList = nameElementsArray;
        }
    }

    /**
     * Turns a list of strings into a string
     *
     * @param list the list
     * @return The resulting string
     */
    private static StringBuilder listToString(List<?> list) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            result.append(" ");
            result.append(list.get(i));
        }
        return result;
    }

    @Override
    public String toString() {
        return this.lastName + " " + listToString(this.firstNameList);
    }
}
