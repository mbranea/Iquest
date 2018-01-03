package com.iquestgroup.braneamadalin.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class representation of the person
 */
public abstract class Person {
    private String lastName;
    private List<String> firstNameList;

    /**
     * Separate name constructor
     *
     * @param lastName Nume
     * @param surname  Prenume
     */
    public Person(String lastName, String surname) {
        this.lastName = lastName;
        this.firstNameList = Arrays.asList(surname.split(" "));

    }

    /**
     * Fullname constructor
     *
     * @param fullName Numele complet
     */
    public Person(String fullName) {
        if (fullName == null) {
            this.lastName = "";
            this.firstNameList = Arrays.asList(new String[]{""});

        } else {

            List<String> nameElements = Arrays.asList(fullName.split(" "));
            this.lastName = nameElements.get(0);
            ArrayList<String> nameElementsArray = new ArrayList<>(nameElements);
            nameElementsArray.remove(0);
            this.firstNameList = nameElementsArray;
        }

    }

    public abstract String getBirthDate();

    public abstract String selfDescribe();

    /**
     * Equivalent of the toString method
     *
     * @param list lista de printat
     * @return Stringul rezultat(ca Stringbuilder
     */
    public StringBuilder listToString(List<String> list) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            result.append(" ");
            result.append(list.get(i));
        }
        return result;
    }
}


